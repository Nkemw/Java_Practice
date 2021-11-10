package project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class BorderLayoutDemo extends JFrame{
	BorderLayoutDemo() {
		setTitle("º¸´õ ·¹ÀÌ¾Æ¿ô");
		setLayout(new BorderLayout());
		
		add("East", new JButton("µ¿"));
		add("West", new JButton("µ¿"));
		add("South", new JButton("µ¿"));
		add(new JButton("ºÏ"), BorderLayout.NORTH);
		add(new JButton("Áß¾Ó"), BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 110);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutDemo();

	}

}
