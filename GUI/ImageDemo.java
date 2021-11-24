package project;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageDemo extends JFrame{

	ImageDemo(){
		setTitle("이미지 그리기");
		
		class MyPanel extends JPanel{
			BufferedImage img;
			
			public MyPanel() {
				try {
					img = ImageIO.read(new File("C:\\Users\\KMW\\Desktop\\시간표.png"));
				} catch (IOException e) {
				}
			}
			
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(img, 0, 0, null);
				g.drawImage(img, 0, 0, 150, 150, 50, 50, 150, 150, null);
			}
		}
		
		add(new MyPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320, 265);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ImageDemo();

	}

}