package org.study.condionEx;

import java.util.Scanner;

public class Ifex3 {
	public static void main(String[] args) {
		System.out.println("조건이 두개 일때--");
		// 아이디, 비밀번호를 입력 받아서
		// 아이디와 비밀번호가 일치 하면 로그인 성공
		// 하나라도 틀리면 로그인 실패 콘솔에 출력
		// && 이용
		String id="m111";
		String pw="1111";
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("아이디 입력: ");
		String userId=input.next();
		
		System.out.print("비밀번호 입력: ");
		String userPw=input.next();
		
		if(userId.equals(id) && userPw.equals(pw)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	/*	
		if(!userId.equals(id) || !userPw.equals(pw)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		*/
		System.out.println("프로그램 종료합니다.");	
		input.close();
		
	}
}
