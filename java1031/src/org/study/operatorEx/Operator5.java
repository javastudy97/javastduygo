package org.study.operatorEx;

import java.util.Scanner;

public class Operator5 {
	public static void main(String[] args) {
		System.out.println("조건연산자");
		
		String userId="m111";
		String userPw="1111";
							//조건1	&& 	조건2 -> 모든 조건이 true일때만 true
		System.out.println(userId.equals("m111") && userPw.equals("1111"));
		System.out.println(userId.equals("m111") && userPw.equals("2222"));
		System.out.println(userId.equals("1222") && userPw.equals("1111"));
		System.out.println(userId.equals("1222") && userPw.equals("1222"));
		System.out.println("=============");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("=============");


		// 아이디, 비밀번호가 동시에 일치 하면 "로그인성공", 그렇지 않으면"로그인 실패"
		// 콘솔에 출력
		// Scanner, 아이디-> id, 비밀번호-> pw입력을 받아서
		// userId,userPw와 동시에 일치하는 프로그래밍을 해보세요.
		// &&, if~else
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = scn.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = scn.nextLine();
		
		
		
		if(userId.equals(id) && userPw.equals(pw)){
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	
		
	}
}
