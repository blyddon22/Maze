package game;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class winner extends JFrame implements ActionListener{
	Window w = new Window();
	private JButton restart = new JButton("Restart?");
	private JButton quit = new JButton("Quit");
	
	public winner(){
		super ("Game Over");
		setLayout(new FlowLayout());
		add(restart);
		add(quit);
		restart.addActionListener(this);
		quit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == restart){
			Window.LevelOne();
		}
		else if(src == quit){
			System.exit(0);
		}
	}
}
