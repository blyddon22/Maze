package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;


public class LevelThree extends JPanel implements ActionListener, KeyListener {
	Window w = new Window();
	Timer t = new Timer(5, this);
	double x = 12, y = 290, velx = 0, vely = 0;
	double rect1x = 1100, rect1y = 180;
	double rect2x = 160, rect2y = 480;
	double rect3x = 950, rect3y = 520;
	int count = 0;
	
	public int getCount(){
		return count;
	}
	
	public LevelThree() {
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
		g2.fill(new Rectangle2D.Double(70, 80, 10, 260));
		g2.fill(new Rectangle2D.Double(10, 340, 70, 10));
		g2.fill(new Rectangle2D.Double(70, 80, 300, 10));
		g2.fill(new Rectangle2D.Double(410, 80, 200, 10));
		g2.fill(new Rectangle2D.Double(650, 80, 580, 10));
		g2.fill(new Rectangle2D.Double(1230, 80, 10, 220));
		g2.fill(new Rectangle2D.Double(1230, 300, 70, 10));
		g2.fill(new Rectangle2D.Double(520, 80, 10, 80));
		g2.fill(new Rectangle2D.Double(150, 160, 800, 10));
		g2.fill(new Rectangle2D.Double(150, 160, 10, 200));
		g2.fill(new Rectangle2D.Double(950, 80, 10, 90));
		g2.fill(new Rectangle2D.Double(240, 250, 510, 10));	
		g2.fill(new Rectangle2D.Double(790, 250, 200, 10));
		g2.fill(new Rectangle2D.Double(840, 170, 10, 90));
		g2.fill(new Rectangle2D.Double(640, 250, 10, 300));
		g2.fill(new Rectangle2D.Double(10, 420, 240, 10));
		g2.fill(new Rectangle2D.Double(240, 250, 10, 170));
		g2.fill(new Rectangle2D.Double(320, 310, 230, 290));
		g2.fill(new Rectangle2D.Double(720, 310, 10, 290));
		g2.fill(new Rectangle2D.Double(720, 310, 400, 10));
		g2.fill(new Rectangle2D.Double(1120, 310, 10, 80));
		g2.fill(new Rectangle2D.Double(800, 380, 320, 10));
		g2.fill(new Rectangle2D.Double(800, 380, 10, 170));
		g2.fill(new Rectangle2D.Double(1080, 450, 220, 10));
		g2.fill(new Rectangle2D.Double(1080, 450, 10, 100));
	}
	
	public void actionPerformed(ActionEvent e){
		repaint();
		
		if(rect1x == 1400 && rect1y == 10 && rect2x == 1400 && rect2y == 10 && rect3x == 1400 && rect3y == 10){
			t.stop();
			w.LevelFour();
			
		}
		
		x += velx;
		if(x < 10){
			x = 10;
		}
		if(x > 1290){
			x = 1290;
		}
		
		//go right/left
		
		x = goRight(60,64,70,346);
		x = goLeft(78,74,70,346);
		x = goLeft(369,365,70,89);
		x = goRight(400,404,70,89);
		x = goRight(510,514,89,155);
		x = goLeft(529,525,89,155);
		x = goRight(640,644,70,89);
		x = goLeft(1238,1234,70,309);
		x = goRight(1220,1224,70,309);
		x = goRight(940,944,89,169);
		x = goLeft(959,955,89,169);
		x = goRight(140,144,150,358);
		x = goLeft(159,155,150,358);
		x = goRight(830,834,165,250);
		x = goLeft(849,845,165,250);
		x = goRight(780,784,240,259);
		x = goLeft(988,984,240,259);
		x = goLeft(748,744,240,259);
		x = goRight(230,234,240,410);
		x = goLeft(249,245,240,429);
		x = goRight(630,634,240,549);
		x = goLeft(649,645,240,549);
		x = goLeft(549,545,300,700);
		x = goRight(310,314,300,700);
		x = goRight(710,714,300,900);
		x = goLeft(1128,1124,300,389);
		x = goRight(790,794,372,547);
		x = goLeft(809,807,385,547);
		x = goRight(1110,1114,300,389);
		x = goLeft(729,725,300,900);
		x = goRight(1070,1074,440,549);
		x = goLeft(1089,1085,440,549);
		
		
		
		
		
		y += vely;
		if(y < 10){
			y = 10;
		}
		if(y > 590){
			y = 590;
		}
		
		//go up/down 
		
		y = goDown(330,334,0,78);
		y = goUp(349,345,0,78);
		y = goUp(89,85,68,369);
		y = goDown(70,74,60,369);
		y = goDown(70,74,400,608);
		y = goUp(89,85,400,608);
		y = goUp(89,85,640,1238);
		y = goDown(70,74,640,1238);
		y = goUp(309,305,1220,1400);
		y = goDown(290,294,1220,1400);
		y = goUp(169,165,140,959);
		y = goDown(150,154,140,959);
		y = goUp(358,354,140,159);
		y = goDown(240,244,780,988);
		y = goUp(259,255,780,988);
		y = goDown(240,244,230,748);
		y = goDown(410,414,0,240);
		y = goUp(429,425,0,249);
		y = goUp(259,255,230,748);
		y = goUp(549,545,630,649);
		y = goDown(300,306,310,549);
		y = goDown(300,304,710,1128);
		y = goUp(389,385,790,1128);
		y = goUp(549,545,790,809);
		y = goDown(371,375,790,1128);
		y = goUp(319,315,710,1128);
		y = goDown(440,444,1070,1300);
		y = goUp(549,545,1070,1089);
		y = goUp(459,455,1070,1300);
	 	
 		
		
		if(x > 1090 && x < 1120 && y > 170 && y < 200){
			rect1x = 1400;
			rect1y = 10;
		}
		
		if(x > 150 && x < 180 && y > 470 && y < 500){
			rect2x = 1400;
			rect2y = 10;
		}
		
		if(x > 940 && x < 970 && y > 510 && y < 530){
			rect3x = 1400;
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

		
		
		