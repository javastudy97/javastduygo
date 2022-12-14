package org.study.gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuEx extends JFrame{
	
	public JMenuEx() {
		super("JMenu Ex");
		JMenuBar bar = new JMenuBar();//메뉴바 생성
		setJMenuBar(bar);//적용
		
		//파일 메뉴 만들기 -------------------------
		JMenu filemenu = new JMenu("파일(F)");//1차 메뉴탭 설정
		filemenu.setMnemonic('F');; //단축키를 Alf + F 로 설정
		
		JMenuItem newfile = new JMenuItem("새파일(N)");//2차 메뉴 탭(아이템) 설정
		newfile.setMnemonic('N'); //단축키를 Alf + N 으로 설정
		filemenu.add(newfile);//JMenuItem인 newfile을 JMenu의 filemenu에 저장
		
		JMenuItem open = new JMenuItem("열기(O)");
		open.setMnemonic('O'); 
		filemenu.add(open);
		
		JMenuItem save = new JMenuItem("저장(S)");
		save.setMnemonic('S'); 
		filemenu.add(save);
		
		JMenuItem close = new JMenuItem("닫기(C)");
		close.setMnemonic('C'); 
		filemenu.add(close);
		bar.add(filemenu); //JMenuBar에 JMenu 부착
		
		//도움말 메뉴 만들기
		JMenu helpmenu = new JMenu("도움말(D)");
		helpmenu.setMnemonic('D'); //단축키를 Alf + D 로 설정
		
		JMenuItem help = new JMenuItem("Help(H)");
		help.setMnemonic('H');
		helpmenu.add(help);
		bar.add(helpmenu);
		
		setSize(400, 200);//프레임 사이즈 설정
		setVisible(true);//보이기
	}
	
	public static void main(String[] args) {
		
		JMenuEx j1 = new JMenuEx();
		j1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
