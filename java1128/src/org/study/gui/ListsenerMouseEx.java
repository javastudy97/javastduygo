package org.study.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
class MyMouseListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		//눌렀다 땠을 때 **********
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.GREEN);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//누르고 있을 때
		JButton btn	= (JButton) e.getSource();
		btn.setBackground(Color.BLACK);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//누르고 있다가 땟을때
		JButton btn	= (JButton) e.getSource();
		btn.setBackground(Color.PINK);
	}
	

	@Override
	public void mouseEntered(MouseEvent e) { //e -> 실제 이벤트 적용 target
		//마우스가 버튼에 올라올 때 호출
		JButton btn = (JButton) e.getSource();
		//마우스가 올라간 버튼의 주소을 알아낸다.
		btn.setBackground(Color.RED);
		// 버튼의 배경색을 빨강색으로 변경
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//마우스가 버튼에서 내려갈때 호출
		JButton btn = (JButton) e.getSource();
		// 마우가 올라간 버튼의 주소를 알아낸다.
		btn.setBackground(Color.YELLOW);
		// 버튼의 배경색을 노란색으로 변경
	}
	
}

public class ListsenerMouseEx extends JFrame{
	
	public ListsenerMouseEx() {
		
		this.setTitle("버튼에 Mouse 이벤트 리스너 작성");
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//버튼 컴포넌트를 생성하고 MouseListener를 단다.
		JButton btn = new JButton("Monse Event 테스트 버튼");
//		this.add(new JButton("BTN1"));
		btn.setBackground(Color.YELLOW);
		
		MyMouseListener listener = new MyMouseListener();
		btn.addMouseListener(listener);// 버튼(btn) 리스너를 추가한다.
		// 누르는 순간에 실행시켜라
		this.add(btn);
		this.setSize(300, 150);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ListsenerMouseEx();
	}
}
