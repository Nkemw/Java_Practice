package project;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class GridLayoutDemo extends JFrame{
	GridLayoutDemo() {
		setTitle("�׸��� ���̾ƿ�");
		setLayout(new GridLayout(0, 3));
		
		add(new JButton("B 1"));
		add(new JButton("��ư 2"));
		add(new JButton("Button 3"));
		add(new JButton("Button four"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 110);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutDemo();

	}

}
