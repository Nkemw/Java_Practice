package project;

import java.awt.FlowLayout;

import javax.swing.*;
import project.JcompoDemo.MyGUI;

public class JcomboDemo {

	static class MyGUI extends JFrame {
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("컴포넌트 연습");
			
			this.setLayout(new FlowLayout());
			
			String[] pet = {"고양이", "강아지", "토끼", "코알라", "송아지"};
			
			JList list = new JList(pet);
			this.add(list);
			
			JComboBox combo = new JComboBox(pet);
			this.add(combo);
			
			setSize(200, 200);
			setVisible(true);
		}
	}
	public static void main(String[] args) {
		new MyGUI();

	}

}
