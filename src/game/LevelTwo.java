package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;


public class LevelTwo extends JPanel implements ActionListener, KeyListener {
	Window w = new Window();
	Timer t = new Timer(5, this);
	double x = 12, y = 290, velx = 0, vely = 0;
	double rect1x = 205, rect1y = 400;
	double rect2x = 660, rect2y = 190;
	double rect3x = 1100, rect3y = 520;
	int count = 0;
	
	public int getCount(){
		return count;
	}
	
	public LevelTwo() {
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.fill(new Ellipse2D.Double(x, y,10, 10));
		g2.fill(new Rectangle2D.Double(rect1x, rect1y, 20, 20));
		g2.fill(new Rectangle2D.Double(rect2x, rect2y, 20, 20));
		g2.fill(new Rectangle2D.Double(rect3x, rect3y, 20, 20));
		g2.draw(new Rectangle2D.Double(10,10,1290,590));
		g2.fill(new Rectangle2D.Double(10, 320, 80, 280));
		g2.fill(new Rectangle2D.Double(10, 220, 270, 50));
		g2.fill(new Rectangle2D.Double(320, 10, 40, 80));
		g2.fill(new Rectangle2D.Double(320, 120, 40, 150));
		g2.fill(new Rectangle2D.Double(60, 160, 530, 10));
		g2.fill(new Rectangle2D.Double(50, 110, 10, 60));
		g2.fill(new Rectangle2D.Double(590, 160, 10, 90));
		g2.fill(new Rectangle2D.Double(590, 250, 160, 10));
		g2.fill(new Rectangle2D.Double(740, 10, 10, 250));
		g2.fill(new Rectangle2D.Double(70, 350, 420, 10));
		g2.fill(new Rectangle2D.Double(480, 250, 10, 100));
		g2.fill(new Rectangle2D.Double(280, 350, 10, 100));
		g2.fill(new Rectangle2D.Double(160, 450, 130, 10));
		g2.fill(new Rectangle2D.Double(230, 510, 700, 90));
		g2.fill(new Rectangle2D.Double(600, 350, 330, 190));
		g2.fill(new Rectangle2D.Double(1040, 480, 10, 120));
		g2.fill(new Rectangle2D.Double(1040, 470, 130, 10));
		g2.fill(new Rectangle2D.Double(1170, 470, 10, 90));
		g2.fill(new Rectangle2D.Double(860, 60, 360, 40));
		g2.fill(new Rectangle2D.Double(1180, 60, 40, 200));
		g2.fill(new Rectangle2D.Double(1000, 200, 80, 200));
		g2.fill(new Rectangle2D.Double(1140, 330, 160, 50));
		
	}
	
	public void actionPerformed(ActionEvent e){
		repaint();
		
		if(rect1x == 10 && rect1y == 500 && rect2x == 10 && rect2y == 500 && rect3x == 10 && rect3y == 500){
			t.stop();
			w.LevelThree();
		}
		
		x += velx;
		if(x < 10){
			x = 10;
		}
		if(x > 1290){
			x = 1290;
		}
		
		//go rights/lefts
		
		x = goRight(150,154,440,458);
		x = goLeft(290,286,352,457);
		x = goLeft(490,486,240,352);
		x = goRight(470,474,240,352);
		x = goRight(270,275,352,457);
		x = goRight(590,594,344,550);
		x = goLeft(929,925,344,700);
		x = goRight(1030,1034,460,700);
		x = goLeft(1049,1045,460,700);
		x = goLeft(1179,1175,460,559);
		x = goRight(1160,1164,460,559);
		x = goRight(990,994,190,395);
		x = goLeft(1079,1075,190,395);
		x = goRight(1130,1134,321,375);
		x = goLeft(1219,1215,50,255);
		x = goRight(851,855,50,99);
		x = goRight(730,734,0,258);
		x = goLeft(749,745,0,258);
		x = goRight(580,584,165,258);
		x = goLeft(601,597,153,258);
		x = goRight(310,314,0,88);
		x = goLeft(359,355,0,88);
		x = goRight(310,314,113,265);
		x = goLeft(359,355,113,265);
		x = goRight(40,44,100,166);
		x = goLeft(59,55,100,166);
		x = goLeft(279,275,215,269);
		x = goLeft(89,85,312,800);
		x = goRight(220,224,500,800);
		x = goRight(1170,1174,50,255);
		
		
		
		
		
		y += vely;
		if(y < 10){
			y = 10;
		}
		if(y > 590){
			y = 590;
		}
		
		//go up/down
		
		y = goUp(269,265,10,278);
		y = goUp(269,265, 312, 357);
		y = goUp(258,254, 582, 746);
		y = goUp(258,254, 1172, 1217);
		y = goUp(169,165,40,601);
		y = goUp(99, 95, 852, 1205);
		y = goUp(89,85,312,357);
		y = goUp(359,355, 60, 487);
		y = goUp(458,454,153,287);
		y = goUp(379,375,1131,1350);
		y = goUp(399,375,991,1077);
		y = goUp(478,473,1031,1169);
		y = goDown(210,214,10,278);
		y = goDown(150,154,40,597);
		y = goDown(240,244,597,735);
		y = goDown(190,194,995,1077);
		y = goDown(310,314, 10, 88);
		y = goDown(341,345, 88, 485);
		y = goDown(341,345,591,925);
		y = goDown(321,325,1130,1300);
		y = goDown(460,464,1031,1178);
		y = goDown(500,504,221,700);
		y = goDown(110,114,312,357);
		y = goDown(100,104,41, 58);
		y = goDown(440,444,150,278);
		y = goDown(240,244,470,489);
		y = goUp(559,555,1160,1179);
		y = goDown(50,54,852,1219);
		
		
		
		
		
		
		
		
		
		if(x > 195 && x < 225 && y > 390 && y < 420){
			rect1x = 10;
			rect1y = 500;
		}
		
		if(x > 650 && x < 680 && y > 180 && y < 210){
			rect2x = 10;
			rect2y = 500;
		}
		
		if(x > 1090 && x < 1120 && y > 510 && y < 540){
			rect3x = 10;
			rect3y = 500;
		}
	}
	

	public void up(){
		vely = -2;
		velx = 0;
	}
	
	public void down(){
		vely = 2;
		velx = 0;
	}
	
	public void left(){
		velx = -2;
		vely = 0;
	}
	
	public void right(){
		velx = 2;
		vely = 0;
	}
	
	public void keyPressed(KeyEvent e){
		int code = e.getKeyCode();
		if(code == KeyEvent.VK_W){
			up();
		}
		
		if(code == KeyEvent.VK_S){
			down();
		}
		
		if(code == KeyEvent.VK_A){
			left();
		}
		
		if(code == KeyEvent.VK_D){
			right();
		}
	}
	
	public void keyTyped(KeyEvent e){
		
	}
	
	
	
	public double goLeft(int xcoord, int xcoord2, int ycoord, int ycoord2){
		if(x < xcoord && x > xcoord2){
			if(y > ycoord && y < ycoord2){
				x = xcoord;
			}
		}
		return x;
	}
	
	public double goDown(int ycoord, int ycoord2, int xcoord, int xcoord2){
		if(y > ycoord && y < ycoord2){
			if(x > xcoord && x < xcoord2){
				y = ycoord;
			}
		}
		return y;
	}
	
	public double goUp(int ycoord, int ycoord2, int xcoord, int xcoord2){
		if(y < ycoord && y > ycoord2){
			if(x > xcoord && x < xcoord2){
				y = ycoord;
			}
		}
		
		return y;
	}
	
	public double goRight(int xcoord, int xcoord2, int ycoord, int ycoord2){
		if(x > xcoord && x < xcoord2){
			if(y > ycoord && y < ycoord2){
				x = xcoord;
			}
		}
		return x;
	}

	public void keyReleased(KeyEvent arg0) {
		
	}
	
}
