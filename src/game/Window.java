package game;

import javax.swing.JFrame;

public class Window {
	private static JFrame f;
	private static Menu2 mm;
	
	
	public static void main(String[] args){
		Menu();
		//LevelSeven();
	}
	
	
	public Window(){
		f = new JFrame();
	}
	
	public static void Menu(){
		mm = new Menu2();
		mm.setVisible(true);
		mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mm.setSize(300, 250);
	}
	
	public static void LevelOne(){
		LevelOne a = new LevelOne();
		mm.setVisible(false);
		f.add(a);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1325, 650);
	}
	
	public void LevelTwo(){
		LevelTwo b = new LevelTwo();
		f.add(b);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1325, 650);
	}
	
	public void LevelThree(){
		f = new JFrame();
		LevelThree c = new LevelThree();
		f.add(c);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1325, 650);
	}
	
	public void LevelFour(){
		f = new JFrame();
		LevelFour d = new LevelFour();
		f.add(d);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1325, 650);

	}
	
	public void LevelFive(){
		f = new JFrame();
		LevelFive e = new LevelFive();
		f.add(e);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1325, 650);
	}
	
	
	public static void LevelSix(){
		f = new JFrame();
		LevelSix h = new LevelSix();
		f.add(h);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1325, 650);
	}
	
	public static void LevelSeven(){
		f = new JFrame();
		LevelSeven i = new LevelSeven();
		f.add(i);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1325, 650);
	}
	
	
	public void winner(){
		winner j = new winner();
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(250, 150);
	}
}