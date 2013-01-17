package game;

import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;


public class LevelOne extends JPanel implements ActionListener, KeyListener {
	Window w = new Window();
	Timer t = new Timer(5, this);
	double x = 12, y = 290, velx = 0, vely = 0;
	double rect1x = 380, rect1y = 100;
	double rect2x = 730, rect2y = 355;
	double rect3x = 970, rect3y = 160;
	int count = 2;
	
	public int getCount(){
		return count;
	}
	
	public LevelOne() {
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
		g2.fill(new Rectangle2D.Double(10,320,150,280));
		g2.fill(new Rectangle2D.Double(160,320,10,280));
		g2.fill(new Rectangle2D.Double(170,410,120,190));
		g2.fill(new Rectangle2D.Double(290,410,10,190));
		g2.fill(new Rectangle2D.Double(290,460,120,140));
		g2.fill(new Rectangle2D.Double(410,460,10,140));
		g2.fill(new Rectangle2D.Double(540,460,10,140));
		g2.fill(new Rectangle2D.Double(540,460,420,140));
		g2.fill(new Rectangle2D.Double(950, 280, 10, 180));
		g2.fill(new Rectangle2D.Double(950, 280, 350, 320));
		g2.fill(new Rectangle2D.Double(510, 280, 320, 10));
		g2.fill(new Rectangle2D.Double(830,280,10,110));
		g2.fill(new Rectangle2D.Double(370, 390, 470, 10));
		g2.fill(new Rectangle2D.Double(500, 280, 110, 60));
		g2.fill(new Rectangle2D.Double(700, 330, 10, 60));
		g2.fill(new Rectangle2D.Double(710, 330, 70, 10));
		g2.fill(new Rectangle2D.Double(370, 340, 10, 50));
		g2.fill(new Rectangle2D.Double(240, 340, 130, 10));
		g2.fill(new Rectangle2D.Double(240, 280, 10, 60));
		g2.fill(new Rectangle2D.Double(10,10,180, 260));
		g2.fill(new Rectangle2D.Double(290, 60, 30, 170));
		g2.fill(new Rectangle2D.Double(310, 160, 200, 70));
		g2.fill(new Rectangle2D.Double(460, 10, 50, 160));
		g2.fill(new Rectangle2D.Double(600, 50, 70, 150));
		g2.fill(new Rectangle2D.Double(670, 50, 100, 50));
		g2.fill(new Rectangle2D.Double(770, 50, 80, 10));
		g2.fill(new Rectangle2D.Double(850, 10, 10, 50));
		g2.fill(new Rectangle2D.Double(920, 110, 180, 10));
		g2.fill(new Rectangle2D.Double(920, 120, 10, 100));
		g2.fill(new Rectangle2D.Double(920, 220, 280, 10));
		g2.fill(new Rectangle2D.Double(1190, 10, 10, 210));	
	}
	
	public void actionPerformed(ActionEvent e){
		repaint();
		if(rect1x == 10 && rect1y == 10 && rect2x == 10 && rect2y == 10 && rect3x == 10 && rect3y == 10){
			t.stop();
			w.LevelTwo();
		}
		
		x += velx;
		if(x < 10){
			x = 10;
		}
		if(x > 1290){
			x = 1290;
		}
		
		x = goLeft(169, 0, 310, 580);
		x = goLeft(299, 0, 405, 580);
		x = goLeft(419, 0, 453, 600);
		x = goRight(530, 1300, 455, 600);
		x = goRight(940, 1300, 270 ,600);
		x = goLeft(189, 0, 5, 269);
		x = goRight(280, 290, 50, 228);
		x = goLeft(319, 300, 50, 228);
		x = goRight(450,500, 0, 228);
		x = goLeft(509, 460, 0, 228);
		x = goRight(230, 235, 271, 347);
		x = goLeft(249, 240, 271, 347);
		x = goRight(360, 365, 340, 395);
		x = goLeft(379, 365, 332, 395);
		x = goRight(820, 825, 280, 395);
		x = goRight(690, 695, 322, 395);
		x = goLeft(709,695,322,395);
		x = goLeft(839,825,270,395);
		x = goRight(490, 499, 272, 339);
		x = goLeft(609, 595, 272, 339);
		x = goLeft(779, 774, 320, 339);
		x = goRight(590, 595, 41, 198);
		x = goLeft(669, 665, 41, 198);
		x = goLeft(769, 725, 41, 99);
		x = goLeft(859, 855, 0, 59);
		x = goRight(840, 845, 0, 59);
		x = goRight(910, 915, 101, 229);
		x = goRight(1180, 1185, 0, 229);
		x = goLeft(929, 915, 101, 229);
		x = goLeft(1199, 1195, 0, 220);
		x = goLeft(1099, 1095, 101, 119);
		
		
		y += vely;
		if(y < 10){
			y = 10;
		}
		if(y > 590){
			y = 590;
		}
		
		y = goDown(310, 600, 10, 166);
		y = goDown(400, 600, 151, 295);
		y = goDown(450, 600, 295, 416);
		y = goDown(450, 600, 530, 1200);
		y = goDown(270, 600, 940, 1300);
		y = goUp(269, 0, 0, 189);
		y = goDown(50, 210, 280, 310);
		y = goDown(150, 220, 280, 500);
		y = goUp(229, 200, 280, 507);
		y = goUp(399, 389, 361, 838);
		y = goDown(271, 280, 230, 249);
		y = goUp(349, 345, 230, 370);
		y = goDown(330, 345, 230, 375);
		y = goDown(380, 385, 361, 838);
		y = goUp(289, 285, 490, 838);
		y = goUp(339, 315, 490, 609);
		y = goDown(320, 325, 690, 779);
		y = goUp(339, 335, 690, 779);
		y = goDown(270, 275, 490, 838);
		y = goUp(199, 185, 590, 669);
		y = goUp(99, 95, 660, 769);
		y = goUp(59, 55, 765, 859);
		y = goDown(40, 45, 591, 858);
		y = goDown(101, 105, 915, 1098);
		y = goUp(119, 115, 915, 1098);
		y = goDown(210, 225, 915, 1199);
		y = goUp(229, 225, 915, 1199);
		
		if(x > 370 && x < 400 && y > 90 && y < 120){
			rect1x = 10;
			rect1y = 10;
		}

		
		if(x > 720 && x < 750 && y > 345 && y < 375){
			rect2x = 10;
			rect2y = 10;
		}
		
		if(x > 960 && x < 990 && y > 150 && y < 180){
			rect3x = 10;
			rect3y = 10;
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
	
	public void keyReleased(KeyEvent e){
		
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
}
