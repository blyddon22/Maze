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

public class LevelSeven  extends JPanel implements ActionListener, KeyListener {
	Window w = new Window();
	Timer t = new Timer(5, this);
	double x = 12, y = 290, velx = 0, vely = 0;
	double rect1x = 950, rect1y = 150;
	double rect2x = 500, rect2y = 280;
	double rect3x = 1000, rect3y = 520;
	
	
	public LevelSeven() {
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
		g2.fill(new Rectangle2D.Double(10, 320, 100, 10));
		g2.fill(new Rectangle2D.Double(100, 80, 10, 250));
		g2.fill(new Rectangle2D.Double(100, 80, 800, 10));
		g2.fill(new Rectangle2D.Double(890, 80, 10, 140));
		g2.fill(new Rectangle2D.Double(1020, 10, 10, 210));
		g2.fill(new Rectangle2D.Double(890, 210, 140, 10));
		
		
	
	}
	
	public void actionPerformed(ActionEvent e){
		repaint();
		
		if(rect1x == 1400 || rect1y == 10 && rect2x == 1400 && rect2y == 10 || rect3x == 1400 && rect3y == 10){
			t.stop();
			//w.winner();
		}
		
		x += velx;
		if(x < 10){
			x = 10;
		}
		if(x > 1290){
			x = 1290;
		}
		
		//x walls go here
		
		y += vely;
		if(y < 10){
			y = 10;
		}
		if(y > 590){
			y = 590;
		}
		
		//y walls go here.
		
		/*
		*	double rect1x = 150, rect1y = 150;
		*	double rect2x = 500, rect2y = 280;
		*	double rect3x = 1000, rect3y = 520;
		 */
		
		if(x > 945 && x < 970 && y > 140 && y < 170){
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

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
