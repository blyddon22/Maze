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

public class LevelSix  extends JPanel implements ActionListener, KeyListener {
	Window w = new Window();
	Timer t = new Timer(5, this);
	double x = 12, y = 290, velx = 0, vely = 0;
	double rect1x = 150, rect1y = 150;
	double rect2x = 500, rect2y = 280;
	double rect3x = 1000, rect3y = 520;
	int count = 0;

	
	public int getCount(){
		return count;
	}
	
	public LevelSix() {
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
		g2.fill(new Rectangle2D.Double(10, 340, 50, 10));
		g2.fill(new Rectangle2D.Double(60, 80, 10, 270));
		g2.fill(new Rectangle2D.Double(60, 40, 500, 10));
		g2.fill(new Rectangle2D.Double(550, 10, 10, 30));
		g2.fill(new Rectangle2D.Double(60, 80, 190, 10));
		g2.fill(new Rectangle2D.Double(240, 80, 10, 160));
		g2.fill(new Rectangle2D.Double(110, 240, 140, 10));
		g2.fill(new Rectangle2D.Double(110, 130, 10, 120));
		g2.fill(new Rectangle2D.Double(110, 130, 90, 10));
		g2.fill(new Rectangle2D.Double(190, 130, 10, 70));
		g2.fill(new Rectangle2D.Double(150, 200, 50, 10));
		g2.fill(new Rectangle2D.Double(60, 280, 230, 10));
		g2.fill(new Rectangle2D.Double(290, 80, 10, 210));
		g2.fill(new Rectangle2D.Double(340, 80, 10, 340));
		g2.fill(new Rectangle2D.Double(390, 80, 10, 290));
		g2.fill(new Rectangle2D.Double(440, 80, 10, 130));
		g2.fill(new Rectangle2D.Double(440, 250, 10, 60));
		g2.fill(new Rectangle2D.Double(440, 250, 130, 10));
		g2.fill(new Rectangle2D.Double(10, 510, 50, 10));
		g2.fill(new Rectangle2D.Double(50, 390, 10, 120));
		g2.fill(new Rectangle2D.Double(110, 330, 10, 230));
		g2.fill(new Rectangle2D.Double(110, 550, 100, 10));
		g2.fill(new Rectangle2D.Double(110, 330, 240, 10));
		g2.fill(new Rectangle2D.Double(160, 330, 10, 180));
		g2.fill(new Rectangle2D.Double(210, 400, 10, 160));
		g2.fill(new Rectangle2D.Double(210, 400, 80, 10));
		g2.fill(new Rectangle2D.Double(280, 400, 10, 60));
		g2.fill(new Rectangle2D.Double(250, 460, 40, 10));
		g2.fill(new Rectangle2D.Double(250, 460, 10, 70));
		g2.fill(new Rectangle2D.Double(340, 410, 100, 10));
		g2.fill(new Rectangle2D.Double(430, 410, 10, 150));
		g2.fill(new Rectangle2D.Double(430, 550, 400, 10));
		g2.fill(new Rectangle2D.Double(390, 370, 100, 10));
		g2.fill(new Rectangle2D.Double(480, 370, 10, 140));
		g2.fill(new Rectangle2D.Double(480, 510, 80, 10));
		g2.fill(new Rectangle2D.Double(550, 370, 10, 140));
		g2.fill(new Rectangle2D.Double(390, 300, 50, 10));
		g2.fill(new Rectangle2D.Double(450, 330, 160, 10));
		g2.fill(new Rectangle2D.Double(610, 330, 10, 190));
		g2.fill(new Rectangle2D.Double(610, 510, 280, 10));
		g2.fill(new Rectangle2D.Double(890, 510, 10, 90));
		g2.fill(new Rectangle2D.Double(560, 250, 10, 60));
		g2.fill(new Rectangle2D.Double(560, 300, 70, 10));
		g2.fill(new Rectangle2D.Double(630, 250, 10, 60));
		g2.fill(new Rectangle2D.Double(630, 250, 70, 10));
		g2.fill(new Rectangle2D.Double(690, 250, 10, 210));
		g2.fill(new Rectangle2D.Double(690, 450, 70, 10));
		g2.fill(new Rectangle2D.Double(750, 10, 10, 450));
		g2.fill(new Rectangle2D.Double(750, 180, 250, 10));
		g2.fill(new Rectangle2D.Double(1080, 180, 220, 10));
		g2.fill(new Rectangle2D.Double(440, 80, 240, 10));
		g2.fill(new Rectangle2D.Double(670, 10, 10, 80));
		g2.fill(new Rectangle2D.Double(440, 200, 210, 10));
		g2.fill(new Rectangle2D.Double(710, 10, 10, 120));
		g2.fill(new Rectangle2D.Double(490, 120, 220, 10));
		g2.fill(new Rectangle2D.Double(490, 120, 10, 50));
		g2.fill(new Rectangle2D.Double(490, 160, 190, 10));
		g2.fill(new Rectangle2D.Double(1035, 100, 10, 380));
		g2.fill(new Rectangle2D.Double(810, 260, 10, 200));
		g2.fill(new Rectangle2D.Double(810, 260, 230, 10));
		g2.fill(new Rectangle2D.Double(890, 320, 10, 190));
		g2.fill(new Rectangle2D.Double(890, 320, 150, 10));
		g2.fill(new Rectangle2D.Double(1035, 390, 80, 10));
		g2.fill(new Rectangle2D.Double(1105, 260, 10, 140));
		g2.fill(new Rectangle2D.Double(1105, 260, 140, 10));
		g2.fill(new Rectangle2D.Double(1245, 260, 10, 280));
		g2.fill(new Rectangle2D.Double(1080, 530, 170, 10));
		
	}
	
	public void actionPerformed(ActionEvent e){
		repaint();
		
		if(rect1x == 1400 && rect1y == 10 && rect2x == 1400 && rect2y == 10 && rect3x == 1400 && rect3y == 10){
			t.stop();
			w.winner();
		}
		
		x += velx;
		if(x < 10){
			x = 10;
		}
		if(x > 1290){
			x = 1290;
		}
		
		//x walls go here.
		
		x = goRight(50, 55, 70, 340);
		x = goLeft(69, 65, 70, 349);
		x = goRight(50, 55, 30, 48);
		x = goLeft(559, 555, 0, 49);
		x = goRight(540, 545, 0, 40);
		x = goRight(660, 665, 0, 89);
		x = goLeft(679, 675, 0, 89);
		x = goRight(700, 705, 0, 125);
		x = goLeft(719, 715, 0, 124);
		x = goLeft(249, 245, 70, 249);			
		x = goRight(230, 235, 70, 240);
		x = goRight(100, 105, 120, 249);
		x = goLeft(119, 115, 120, 249);
		x = goLeft(199, 195, 120, 209);
		x = goRight(180, 185, 120, 200);
		x = goRight(140, 145, 190, 209);
		x = goRight(280, 285, 80, 280);
		x = goLeft(299, 295, 80, 289);
		x = goRight(330, 335, 70, 419);
		x = goLeft(349, 345, 70, 419);
		x = goRight(380, 385, 70, 379);
		x = goLeft(399, 395, 70, 379);
		x = goRight(430, 435, 70, 209);
		x = goLeft(449, 445, 70, 209);
		x = goRight(40, 45, 380, 519);
		x = goLeft(59, 55, 380, 519);
		x = goRight(101, 105, 320, 559);
		x = goLeft(119, 115, 330, 559);
		x = goRight(150, 155, 330, 508);
		x = goLeft(169,  165, 330, 508);
		x = goRight(200, 205, 390, 559);
		x = goLeft(219, 215, 390, 559);
		x = goRight(270, 275, 390, 469);
		x = goLeft(289, 285, 390, 469);
		x = goRight(240, 244, 450, 529);
		x = goLeft(259, 255, 450, 529);
		x = goRight(420, 425, 400, 559);
		x = goLeft(439, 435, 400, 559);
		x = goLeft(829, 825, 540, 559);
		x = goRight(1235, 1240, 250, 539);
		x = goLeft(1254, 1245, 250, 539);
		x = goRight(1095, 1100, 250, 399);
		x = goLeft(1114, 1105, 250, 399);
		x = goRight(1025, 1030, 89, 479);
		x = goLeft(1044, 1040, 89, 479);
		x = goRight(1070, 1075, 521, 539);
		x = goRight(1070, 1075, 170, 189);
		x = goRight(740, 745, 0, 459);
		x = goLeft(759, 755, 0, 459);
		x = goLeft(999, 995, 170, 189);
		x = goRight(880, 885, 319, 610);
		x = goLeft(899, 895, 319, 610);
		x = goRight(800, 805, 250, 459);
		x = goLeft(819, 815, 250, 459);
		x = goRight(470, 475, 360, 519);
		x = goLeft(489, 485, 360, 519);
		x = goRight(540, 545, 360, 519);
		x = goLeft(559, 555, 360, 519);
		x = goRight(600, 605, 320, 519);
		x = goLeft(619, 615, 320, 519);
		x = goRight(680, 685, 240, 459);
		x = goLeft(699, 695, 240, 459);
		x = goRight(430, 435, 240, 309);
		x = goLeft(449, 445, 240, 309);
		x = goRight(550, 555, 240, 309);
		x = goLeft(569, 565, 240, 309);
		x = goRight(620, 625, 240, 309);
		x = goLeft(639, 635, 240, 309);
		x = goRight(440, 445, 320, 339);
		x = goRight(480, 485, 110, 169);
		x = goLeft(499, 495, 110, 169);
		x = goLeft(679, 675, 150, 169);
		x = goLeft(649, 645, 190, 209);
		
		
		y += vely;
		if(y < 10){
			y = 10;
		}
		if(y > 590){
			y = 590;
		}
		
		//y walls go here.
		
		y = goDown(330, 335, 0, 55);
		y = goUp(349, 345, 0, 69);
		y = goDown(30, 35, 50, 550);
		y = goUp(49, 45, 50, 559);
		y = goDown(70, 75, 50, 250);
		y = goUp(89, 85, 50, 250);
		y = goDown(70, 75, 280, 299);
		y = goDown(70, 75, 330, 349);
		y = goDown(70, 75, 380, 399);
		y = goDown(70, 75, 430, 670);
		y = goUp(89, 85, 430, 669);
		y = goUp(249, 245, 100, 249);
		y = goDown(230, 235, 100, 240);
		y = goDown(120, 125, 100, 199);
		y = goUp(139, 135, 100, 190);
		y = goDown(270, 275, 50, 299);
		y = goUp(289, 285, 50, 299);
		y = goDown(190, 195, 140, 190);
		y = goUp(209, 195, 140, 199);
		y = goDown(320, 325, 101, 340);
		y = goUp(339, 335, 101, 340);
		y = goDown(500, 505, 0, 59);
		y = goUp(519, 515, 0, 59);
		y = goDown(540, 545, 101, 219);
		y = goUp(559, 555, 101, 219);
		y = goDown(390, 395, 201, 289);
		y = goUp(409, 405, 201, 289);
		y = goDown(450, 455, 241, 289);
		y = goUp(469, 465, 241, 289);
		y = goUp(529, 525, 241, 259);
		y = goDown(380, 385, 40, 59);
		y = goUp(508, 505, 150, 169);
		y = goUp(419, 415, 330, 439);
		y = goDown(400, 405, 330, 439);
		y = goUp(559, 555, 420, 829);
		y = goDown(540, 545, 420, 829);
		y = goUp(189, 185, 1070, 1400);
		y = goDown(170, 175, 1070, 1400);
		y = goDown(90, 95, 1025, 1044);
		y = goUp(479, 475, 1025, 1044);
		y = goUp(399, 395, 1040, 1110);
		y = goDown(380, 385, 1040, 1110);
		y = goDown(250, 255, 1100, 1249);
		y = goUp(269, 265, 1100, 1249);
		y = goDown(520, 525, 1070, 1249);
		y = goUp(539, 535, 1070, 1249);
		y = goDown(170, 175, 740, 999);
		y = goUp(189, 185, 740, 999);
		y = goDown(250, 255, 800, 1030);
		y = goUp(269, 265, 800, 1030);
		y = goDown(310, 315, 880, 1030);
		y = goUp(329, 325, 880, 1030);
		y = goUp(459, 455, 800, 819);
		y = goDown(500, 505, 470, 559);
		y = goUp(519, 515, 470, 559);
		y = goDown(500, 505, 600, 890);
		y = goUp(519, 515, 600, 890);
		y = goDown(440, 445, 680, 750);
		y = goUp(459, 455, 680, 759);
		y = goDown(360, 365, 380, 489);
		y = goUp(379, 375, 380, 489);
		y = goDown(360, 365, 540, 559);
		y = goUp(339, 325, 440, 610);
		y = goDown(320, 325, 440, 619);
		y = goUp(309, 305, 390, 449);
		y = goDown(290, 295, 390, 449);
		y = goUp(259, 255, 430, 569);
		y = goDown(240, 245, 430, 569);
		y = goUp(309, 305, 550, 639);
		y = goDown(290, 295, 550, 639);
		y = goUp(259, 255, 620, 699);
		y = goDown(240,245, 620, 699);
		y = goUp(209, 205, 430, 649);
		y = goDown(190, 195, 430, 649);
		y = goUp(169, 165, 480, 674);
		y = goDown(150, 155, 480, 674);
		y = goUp(129, 125, 480, 719);
		y = goDown(110, 115, 480, 709);
		
		
		/*
		*	double rect1x = 150, rect1y = 150;
		*	double rect2x = 500, rect2y = 280;
		*	double rect3x = 1000, rect3y = 520;
		 */
		
		if(x > 145 && x < 170 && y > 140 && y < 170){
			rect1x = 1400;
			rect1y = 10;
		}
		
		if(x > 495 && x < 520 && y > 270 && y < 300){
			rect2x = 1400;
			rect2y = 10;
		}
		
		if(x > 995 && x < 1020 && y > 510 && y < 540){
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
