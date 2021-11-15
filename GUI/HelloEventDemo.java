package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloEventDemo extends JFrame{
	HelloEventDemo(){
		setTitle("�̺�Ʈ ������");
		
		/*ActionListener l = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư�� Ŭ���߽��ϴ�");
			}

		};*/
		
		ActionListener l = e -> System.out.println("��ư�� Ŭ���߽��ϴ�");
		
		JButton b = new JButton("Ŭ��");
		b.addActionListener(l);
		add(b);
		
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new HelloEventDemo();

	}

}
