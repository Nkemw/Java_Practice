package project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class BorderLayoutDemo extends JFrame{
	BorderLayoutDemo() {
		setTitle("���� ���̾ƿ�");
		setLayout(new BorderLayout());
		
		add("East", new JButton("��"));
		add("West", new JButton("��"));
		add("South", new JButton("��"));
		add(new JButton("��"), BorderLayout.NORTH);
		add(new JButton("�߾�"), BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 110);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutDemo();

	}

}
