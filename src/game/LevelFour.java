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

public class LevelFour extends JPanel implements ActionListener, KeyListener {
	Window w = new Window();
	Timer t = new Timer(5, this);
	double x = 12, y = 290, velx = 0, vely = 0;
	double rect1x = 500, rect1y = 210;
	double rect2x = 580, rect2y = 230;
	double rect3x = 540, rect3y = 400;
	int count = 0;

	
	public int getCount(){
		return count;
	}
	
	public LevelFour() {
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
		g2.fill(new Rectangle2D.Double(540, 50, 10, 260));
		g2.fill(new Rectangle2D.Double(70, 50, 10, 300));
		g2.fill(new Rectangle2D.Double(10, 340, 70, 10));
		g2.fill(new Rectangle2D.Double(70, 50, 900, 10));
		g2.fill(new Rectangle2D.Double(970, 50, 10, 280));
		g2.fill(new Rectangle2D.Double(900, 380, 150, 10));
		g2.fill(new Rectangle2D.Double(1050, 10, 10, 380));
		g2.fill(new Rectangle2D.Double(900, 120, 10, 260));
		g2.fill(new Rectangle2D.Double(800, 120, 100, 10));
		g2.fill(new Rectangle2D.Double(800, 120, 10, 200));
		g2.fill(new Rectangle2D.Double(540, 310, 140, 10));
		g2.fill(new Rectangle2D.Double(720, 310, 80, 10));
		g2.fill(new Rectangle2D.Double(650, 310, 10, 160));
		g2.fill(new Rectangle2D.Double(650, 470, 480, 10));
		g2.fill(new Rectangle2D.Double(1130, 60, 10, 420));
		g2.fill(new Rectangle2D.Double(1130, 60, 80,10));
		g2.fill(new Rectangle2D.Double(1210, 60, 10, 490));
		g2.fill(new Rectangle2D.Double(60, 540, 310, 10));
		g2.fill(new Rectangle2D.Double(420, 540, 540, 10));
		g2.fill(new Rectangle2D.Double(1020, 540, 200, 10));
		g2.fill(new Rectangle2D.Double(680, 480, 10, 70));
		g2.fill(new Rectangle2D.Double(270, 370, 10, 170));
		g2.fill(new Rectangle2D.Double(270, 370, 210, 10));
		g2.fill(new Rectangle2D.Double(480, 370, 10, 170));
		g2.fill(new Rectangle2D.Double(60, 400, 10, 140));
		g2.fill(new Rectangle2D.Double(60, 400, 80, 10));
		g2.fill(new Rectangle2D.Double(140, 120, 10, 290));
		g2.fill(new Rectangle2D.Double(140, 120, 80, 10));
		g2.fill(new Rectangle2D.Double(220, 120, 10, 60));
		g2.fill(new Rectangle2D.Double(220, 220, 10, 100));
		g2.fill(new Rectangle2D.Double(220, 310, 320, 10));
		g2.fill(new Rectangle2D.Double(300, 60, 120, 200));
		
	}

	
	
	public void actionPerformed(ActionEvent e){
		repaint();
		
		if(rect1x == 1400 && rect1y == 10 && rect2x == 1400 && rect2y == 10 && rect3x == 1400 && rect3y == 10){
			t.stop();
			w.LevelFive();
			
		}
		
		x += velx;
		if(x < 10){
			x = 10;
		}
		if(x > 1290){
			x = 1290;
		}
		
		//go left/right functions
		
		x = goRight(1200, 1205, 50, 549);
		x = goLeft(1219, 1210, 50, 549);
		x = goRight(1120, 1125, 50, 479);
		x = goLeft(1139, 1135, 50, 479);
		x = goRight(1040, 1045, 0, 389);
		x = goLeft(1059, 1055, 0, 389);
		x = goRight(960, 965, 40, 329);
		x = goLeft(979, 975, 40, 329);
		x = goRight(890, 895, 110, 389);
		x = goLeft(909, 905, 110, 389);
		x = goRight(790, 799, 110, 319);
		x = goLeft(809, 805, 110, 319);
		x = goRight(710, 715, 300, 319);
		x = goLeft(679, 675, 300, 319);
		x = goRight(670, 675, 460, 549);
		x = goLeft(689, 685, 460, 549);
		x = goRight(640, 645, 300, 479);
		x = goLeft(659, 655, 300, 479);
		x = goRight(530, 535, 40, 319);
		x = goLeft(549, 545, 40, 319);
		x = goRight(470, 475, 360, 549);
		x = goLeft(489, 485, 360, 549);
		x = goRight(290, 295, 40, 259);
		x = goLeft(419, 415, 40, 259);
		x = goRight(260, 265, 360, 549);
		x = goLeft(279, 275, 360, 549);
		x = goRight(210, 215, 110, 179);
		x = goLeft(229, 225, 110, 179);
		x = goRight(210, 215, 210, 319);
		x = goLeft(229, 225, 210, 319);
		x = goRight(1010, 1015, 530, 549);
		x = goLeft(959, 955, 530, 549);
		x = goRight(410, 415, 530, 549);
		x = goLeft(369, 365, 530, 549);
		x = goRight(130, 135, 110, 409);
		x = goLeft(149, 145, 110, 409);
		x = goRight(60, 65, 40, 339);
		x = goLeft(79, 75, 40, 349);
		x = goRight(50, 55, 390, 549);
		x = goLeft(69, 65, 390, 549);
		
		
		
		
		
		y += vely;
		if(y < 10){
			y = 10;
		}
		if(y > 590){
			y = 590;
		}
		
		//go up/down functions.
		
		y = goDown(330, 345, 0, 79);
		y = goUp(349, 345, 0, 79);
		y = goDown(50, 55, 1120, 1219);
		y = goUp(69, 65, 1120, 1219);
		y = goDown(530, 535, 50, 369);
		y = goUp(549, 545, 50, 369);
		y = goDown(530, 535, 410, 959);
		y = goUp(549, 545, 410, 959);
		y = goDown(530, 535, 1010, 1219);
		y = goUp(549, 545, 1010, 1219);
		y = goDown(460, 465, 640, 1139);
		y = goUp(479, 475, 640, 1139);
		y = goDown(390, 395, 50, 149);
		y = goUp(409, 405, 50, 149);
		y = goDown(370, 375, 890, 1059);
		y = goUp(389, 385, 890, 1059);
		y = goUp(329, 325, 960, 979);
		y = goDown(360, 365, 260, 489);
		y = goUp(379, 375, 260, 489);
		y = goDown(300, 305, 210, 679);
		y = goUp(319, 315, 210, 679);
		y = goDown(300, 304, 710, 809);
		y = goUp(319, 315, 710, 809);
		y = goUp(259, 255, 290, 419);
		y = goDown(110, 115, 790, 909);
		y = goUp(129, 125, 790, 909);
		y = goDown(110, 115, 130, 229);
		y = goUp(129, 125, 130, 229);
		y = goUp(179, 175, 210, 229);
		y = goDown(210, 215, 210, 229);
		y = goDown(40, 45, 60, 979);
		y = goUp(59, 55, 60, 979);
		
		/*
		 * 	double rect1x = 500, rect1y = 210;
		 *	double rect2x = 580, rect2y = 230;
		 *	double rect3x = 540, rect3y = 400; 
		 */
		
		if(x > 490 && x < 520 && y > 200 && y < 230){
			rect1x = 1400;
			rect1y = 10;
		}
		
		if(x > 570 && x < 600 && y > 220 && y < 250){
			rect2x = 1400;
			rect2y = 10;
		}
		
		if(x > 530 && x < 560 && y > 390 && y < 420){
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

