package org.study.condionEx;

import java.util.Scanner;

public class SwitchEx01 {
	public static void main(String[] args) {
		//key값이 1이면 "관리자권한"
		//key값이 2이면 "중간관리자권한"
		//key값이 3이면 "일반사원권한"
		//일반이면 접속불가 관리자에서 문의
		
		System.out.println("====switch====");
		Scanner input=new Scanner(System.in);
		
		System.out.print("key 값 입력: ");
		int key = input.nextInt();
		
		switch(key) {
		case 1:
			System.out.println("관리자권한");
			break;
		case 2:
			System.out.println("중간관리자권한");
			break;
		case 3:
			System.out.println("일반사원권한");
			break;
		default:
			System.out.println("접속불가 관리자에게 문의하세요.");
			
		}
		input.close();
	}
}
