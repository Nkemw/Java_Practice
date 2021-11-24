package project;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ClipDemo extends JFrame{

	ClipDemo(){
		setTitle("이미지 그리기");
		
		class MyPanel extends JPanel{
			BufferedImage img, sub_img;
			
			public MyPanel() {
				try {
					img = ImageIO.read(new File("C:\\Users\\KMW\\Desktop\\시간표.png"));
					sub_img = ImageIO.read(new File("C:\\Users\\KMW\\Desktop\\qt4_editor_options_large.png"));
				} catch (IOException e) {
				}
			}
			
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.setClip(30, 20, 240, 170);
				g.drawImage(img, 0, 0, null);
				g.setColor(Color.red);
				g.drawRect(20, 10, 100, 100);
				g.drawImage(sub_img, 190, 120, null);
			}
		}
		
		add(new MyPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320, 265);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ClipDemo();

	}

}