package game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import javax.swing.Timer;

public class LevelFive extends JPanel implements ActionListener, KeyListener {
	Window w = new Window();
	Timer t = new Timer(5, this);
	double x = 12, y = 290, velx = 0, vely = 0;
	double rect1x = 50, rect1y = 50;
	double rect2x = 50, rect2y = 520;
	double rect3x = 740, rect3y = 480;
	int count = 0;

	
	public int getCount(){
		return count;
	}
	
	public LevelFive() {
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
		g2.fill(new Rectangle2D.Double(10, 330, 500, 10));
		g2.fill(new Rectangle2D.Double(560, 330, 680, 10));
		g2.fill(new Rectangle2D.Double(10, 260, 280, 10));
		g2.fill(new Rectangle2D.Double(340, 260, 400, 10));
		g2.fill(new Rectangle2D.Double(790, 260, 510, 10));
		g2.fill(new Rectangle2D.Double(10, 130, 40, 10));
		g2.fill(new Rectangle2D.Double(50, 130, 10, 80));
		g2.fill(new Rectangle2D.Double(50, 210, 330, 10));
		g2.fill(new Rectangle2D.Double(380, 210, 10, 60));
		g2.fill(new Rectangle2D.Double(820, 10, 480, 260));
		g2.fill(new Rectangle2D.Double(710, 60, 10, 210));
		g2.fill(new Rectangle2D.Double(630, 10, 10, 100));
		g2.fill(new Rectangle2D.Double(630, 150, 10, 60));
		g2.fill(new Rectangle2D.Double(560, 180, 10, 90));
		g2.fill(new Rectangle2D.Double(560, 180, 80, 10));
		g2.fill(new Rectangle2D.Double(160, 80, 390, 10));
		g2.fill(new Rectangle2D.Double(540, 10, 10, 80));
		g2.fill(new Rectangle2D.Double(160, 80, 10, 80));
		g2.fill(new Rectangle2D.Double(220, 130, 10, 80));
		g2.fill(new Rectangle2D.Double(220, 130, 290, 10));
		g2.fill(new Rectangle2D.Double(10, 470, 110, 10));
		g2.fill(new Rectangle2D.Double(140, 510, 10, 90));
		g2.fill(new Rectangle2D.Double(70, 420, 200, 10));
		g2.fill(new Rectangle2D.Double(270, 420, 10, 180));
		g2.fill(new Rectangle2D.Double(10, 370, 380, 10));
		g2.fill(new Rectangle2D.Double(390, 370, 10, 190));
		g2.fill(new Rectangle2D.Double(460, 400, 10, 200));
		g2.fill(new Rectangle2D.Double(460, 400, 130, 10));
		g2.fill(new Rectangle2D.Double(590, 380, 10, 30));
		g2.fill(new Rectangle2D.Double(590, 380, 500, 10));
		g2.fill(new Rectangle2D.Double(1080, 330, 10, 150));
		g2.fill(new Rectangle2D.Double(1080, 520, 10, 80));
		g2.fill(new Rectangle2D.Double(1230, 330, 10, 220));
		g2.fill(new Rectangle2D.Double(1160, 390, 10, 160));
		g2.fill(new Rectangle2D.Double(1160, 550, 80, 10));
		g2.fill(new Rectangle2D.Double(680, 440, 130, 10));
		g2.fill(new Rectangle2D.Double(800, 440, 10, 100));
		g2.fill(new Rectangle2D.Double(540, 540, 270, 10));
		g2.fill(new Rectangle2D.Double(540, 540, 10, 60));
		g2.fill(new Rectangle2D.Double(900, 390, 10, 100));
		g2.fill(new Rectangle2D.Double(900, 530, 10, 70));
		g2.fill(new Rectangle2D.Double(950, 430, 10, 130));
		g2.fill(new Rectangle2D.Double(900, 550, 50, 10));
	}


	
	public void actionPerformed(ActionEvent e){
		repaint();
		
		if(rect1x == 1400 && rect1y == 10 && rect2x == 1400 && rect2y == 10 && rect3x == 1400 && rect3y == 10){
			t.stop();
			w.LevelSix();
		}
		
		x += velx;
		if(x < 10){
			x = 10;
		}
		if(x > 1290){
			x = 1290;
		}
		
		//x walls go here.
		
		x = goRight(1220, 1225, 320, 559);
		x = goLeft(1239, 1235, 320, 559);
		x = goRight(1150, 1155, 380, 559);
		x = goLeft(1169, 1165, 380, 559);
		x = goRight(1070, 1075, 320, 479);
		x = goLeft(1089, 1085, 320, 479);
		x = goRight(1070, 1075, 510, 610);
		x = goLeft(1089, 1085, 510, 610);
		x = goRight(890, 895, 370, 489);
		x = goLeft(909, 905, 370, 489);
		x = goRight(890, 895, 520, 610);
		x = goLeft(909, 905, 520, 610);
		x = goRight(940, 945, 420, 559);
		x = goLeft(959, 955, 420, 559);
		x = goRight(810, 825, 0, 269);
		x = goRight(790, 795, 430, 549);
		x = goLeft(809, 805, 430, 549);
		x = goRight(530, 535, 530, 620);
		x = goLeft(549, 545, 530, 620);
		x = goRight(580, 585, 370, 409);
		x = goLeft(599, 595, 370, 409);
		x = goRight(670, 675, 430, 449);
		x = goLeft(469, 465, 400, 620);
		x = goRight(450, 455, 400, 620);
		x = goLeft(149, 145, 500, 610);
		x = goRight(130, 135, 500, 610);
		x = goLeft(119, 115, 460, 479);
		x = goRight(60, 65, 410, 429);
		x = goLeft(279, 275, 410, 610);
		x = goRight(260, 265, 410, 610);
		x = goLeft(399, 395, 360, 559);
		x = goRight(380, 385, 360, 559);
		x = goLeft(509, 505, 320, 339);
		x = goRight(550, 555, 320, 339);
		x = goRight(700, 705, 50, 269);
		x = goLeft(719, 715, 50, 269);
		x = goLeft(739, 735, 250, 269);
		x = goRight(780, 785, 250, 269);
		x = goRight(620, 625, 0, 109);
		x = goLeft(639, 635, 0, 109);
		x = goRight(620, 625, 140, 209);
		x = goLeft(639, 635, 140, 209);
		x = goRight(550, 555, 170, 269);
		x = goLeft(569, 565, 170, 269);
		x = goRight(530, 535, 0, 89);
		x = goLeft(549, 545, 0, 89);
		x = goRight(150, 155, 70, 159);
		x = goLeft(169, 165, 70, 159);
		x = goRight(40, 45, 120, 219);
		x = goLeft(59, 55, 120, 219);
		x = goRight(210, 215, 120,219);
		x = goLeft(229, 225, 120, 219);
		x = goLeft(509, 505, 120, 139);
		x = goLeft(389, 385, 200, 269);
		x = goRight(370, 375, 200, 269);
		x = goRight(330, 335, 250, 269);
		x = goLeft(289, 265, 250, 269);
		
		y += vely;
		if(y < 10){
			y = 10;
		}
		if(y > 590){
			y = 590;
		}
		
		//y walls go here.
		
		y = goUp(269, 265, 0, 289);
		y = goDown(250, 255, 0, 289);
		y = goUp(269, 265, 330, 739);
		y = goDown(250, 255, 330, 739);
		y = goUp(269, 265, 790, 1400);
		y = goDown(250, 255, 790, 850);
		y = goUp(339, 335, 0, 509);
		y = goDown(320, 325, 0, 509);
		y = goUp(339, 335, 550, 1239);
		y = goDown(320, 325, 550, 1239);
		y = goUp(559, 555, 1150, 1239);
		y = goDown(540, 545, 1150, 1239);
		y = goDown(380, 385, 1150, 1169);
		y = goUp(479, 475, 1070, 1089);
		y = goDown(510, 515, 1070, 1089);
		y = goUp(489, 485, 890, 909);
		y = goDown(520, 525, 890, 909);
		y = goUp(559, 555, 890, 959);
		y = goDown(540, 545, 890, 959);
		y = goDown(420, 425, 940, 959);
		y = goDown(530, 535, 530, 800);
		y = goUp(549, 545, 530, 809);
		y = goDown(430, 435, 670, 809);
		y = goUp(449, 444, 670, 809);
		y = goDown(390, 395, 450, 590);
		y = goUp(409, 405, 450, 596);
		y = goDown(370, 375, 580, 1080);
		y = goUp(389, 385, 580, 1080);
		y = goDown(460, 465, 0, 119);
		y = goUp(479, 475, 0, 119);
		y = goDown(500, 505, 130, 149);
		y = goDown(410, 415, 60, 279);
		y = goUp(429, 425, 60, 279);
		y = goUp(559, 555, 380, 399);
		y = goDown(360, 365, 0, 399);
		y = goUp(379, 375, 0, 399);
		y = goDown(50, 55, 700, 719);
		y = goUp(109, 105, 620, 639);
		y = goDown(140, 145, 620, 639);
		y = goUp(209, 205, 620, 639);
		y = goDown(170, 175, 550, 639);
		y = goUp(189, 185, 550, 639);
		y = goDown(70, 75, 150, 549);
		y = goUp(89, 85, 150, 549);
		y = goUp(159, 155, 150, 169);
		y = goUp(139, 135, 0, 59);
		y = goDown(120, 125, 0, 59);
		y = goUp(219, 215, 40, 389);
		y = goDown(200, 205, 40, 389);
		y = goUp(139, 135, 210, 509);
		y = goDown(120, 125, 210, 509);
		
		
		/*
		 *double rect1x = 50, rect1y = 50;
		 *double rect2x = 50, rect2y = 520;
		 *double rect3x = 740, rect3y = 480; 
		 */
		
		if(x > 40 && x < 70 && y > 40 && y < 70){
			rect1x = 1400;
			rect1y = 10;
		}
		
		if(x > 40 && x < 70 && y > 510 && y < 540){
			rect2x = 1400;
			rect2y = 10;
		}
		
		if(x > 730 && x < 760 && y > 470 && y < 500){
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

	public void keyReleased(KeyEvent e) {
	}
	
}
