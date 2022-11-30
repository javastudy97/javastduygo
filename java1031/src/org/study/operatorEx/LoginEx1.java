package org.study.operatorEx;

import java.util.Scanner;

public class LoginEx1 {
	public static void main(String[] args) {
		//userid,userPw를 scanner입력을 받아서
		// id가 일치하면 "아이디가 일치합니다."
		// pw가 일치하면 "비밀번호가 일치합니다"
		// 콘솔에 출력 하는 프로그램을 만들어 보세요
		// if문(조건1-> 2개), equals, System.out.print(),Scanner이용
		
		String userid="m111";
		String userpw="1111";
		
		Scanner scn = new Scanner(System.in);
	    System.out.println("아이디 :" );
		String id = scn.nextLine();
		
	    System.out.println("비밀번호 :" );
		String pw = scn.nextLine();
		
		if(id.equals(userid))
		{
			System.out.println("아이디가 일치합니다.");
		}else {
			System.out.println("아이디가 일치하지 않습니다.");
		}
		
		if(pw.equals(userpw)) {
			System.out.println("비밀번호가 일치합니다.");
		}else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		
		scn.close();
	}
}
