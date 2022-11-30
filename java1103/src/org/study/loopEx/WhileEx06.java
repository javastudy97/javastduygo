package org.study.loopEx;

import java.util.Scanner;

public class WhileEx06 {
	public static void main(String[] args) {
		System.out.println("while(true)");
		// While(true)이용해서
		// 아이디와 비밀번호가 일치하면 while문을 종료("로그인성공")
		// 일치 하지 않으면 "로그인실패" 출력하고 다시 입력
		// 로그인 성공하면 while문을 종료 하는 프로그램을 작성하시오. 
		// while, if, break, Scanner
		
		String dbId="root";
		String dbPw="1111";
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디를 입력하세요:");
			String Id = input.next();
			
			System.out.println("비밀번호를 입력하세요:");
			String pw = input.next();
			
			if(dbId.equals(Id) && dbPw.equals(pw))
			{
				System.out.println("로그인 성공");
				break;
			}else {
				
				System.out.println("로그인 실패");
			}
		   
		}
		
		input.close();
	}
}
