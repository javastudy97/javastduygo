package org.study.gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEX extends JFrame {
	
	public BorderLayoutEX() {
		setTitle("BorderLayout Title"); //프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임 윈도우를 닫으면 프로그램 종료
		setLayout(new BorderLayout());
		
		// BorderLayout 배치관리자 설정
		add(new JButton("BorderApp"), BorderLayout.CENTER);
		add(new JButton("add"), BorderLayout.NORTH);
		add(new JButton("sub"), BorderLayout.SOUTH);
		add(new JButton("mul"), BorderLayout.EAST);
		add(new JButton("div"), BorderLayout.WEST);
		setSize(500, 200); // 프레임 크기 300x200 설정
		setVisible(true); // 프레임을 화면에 출력
	}
	
	public static void main(String[] args) {
		
		new BorderLayoutEX(); // 자신 클래스를 호출
	}
}
