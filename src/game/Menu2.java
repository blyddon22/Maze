package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class Menu2 extends JFrame implements ActionListener {
	Window w = new Window();
	private JButton start = new JButton("Start");
	private JButton exit = new JButton("Exit");
	private JLabel textLabel = new JLabel("Savage Maze Hunt", SwingConstants.CENTER);
	
	public Menu2(){
		super("Main Menu");
		setLayout(new FlowLayout());
		
		add(textLabel);
		add(exit);
		add(start);
		
		textLabel.setPreferredSize(new Dimension(500, 100));
		textLabel.setBackground(Color.WHITE);
		
		start.addActionListener(this);
		exit.addActionListener(this);
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == start){
			Window.LevelOne();
		}
		else if(src == exit){
			System.exit(0);
		}
	}
}
