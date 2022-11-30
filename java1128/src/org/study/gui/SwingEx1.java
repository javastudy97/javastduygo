package org.study.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx1 extends JFrame {
	
	public SwingEx1() {
		setTitle("Swing Ex2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//메인프레임 종료시 모두 종료
		//container생성
		Container conPane=getContentPane();
		conPane.setBackground(Color.BLUE);
		conPane.setLayout(new FlowLayout());//레이아웃 설정 -> 컴포넌트 배치 기준
		//컨테이너에 컴포넌트 추가
		conPane.add(new JButton("OK"));
		conPane.add(new JButton("CANSEL"));
		conPane.add(new JButton("GO!"));
		conPane.add(new JButton("GO!"));
		conPane.add(new JButton("GO!"));
		conPane.add(new JButton("GO!"));
		conPane.add(new JButton("GO!"));
		
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new SwingEx1();
	}
}
