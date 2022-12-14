package org.study.gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AbsoultePaneEx extends JFrame {
	
	public AbsoultePaneEx() {
		this.setTitle("AbsolutePaneEx"); //this 자기자신을 필드라 나타낼 때 생략도 가능
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JButton btn1 = new JButton("BTN1");
		JButton btn2 = new JButton("BTN2");
		JButton btn3 = new JButton("BTN3");
		JButton btn4 = new JButton("BTN4");
		
		
		btn1.setSize(150, 50);
		btn2.setSize(150, 50);
		btn3.setSize(150, 50);
		btn4.setSize(150, 50);
		
		
		btn1.setBackground(Color.green);
		btn1.setLocation(0, 0);
		
		btn2.setBackground(Color.GRAY);
		btn2.setLocation(450, 0);
		
		btn3.setBackground(Color.RED);
		btn3.setLocation(450, 550);
		//btn1,btn2,btn3 -> JFrame의 정중앙에 배치 하도록 설정 하시오
		
		btn4.setBackground(Color.YELLOW);
		btn4.setLocation(0, 550);
		
		panel.add(btn1);//버튼을 패널을 붙인거다.
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		//Object, JFrame
		this.add(panel); // 패널을 프레임에 붙인거다.
		this.setSize(600, 600);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new AbsoultePaneEx();
	}
}
