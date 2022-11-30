package org.study.operatorEx;

import java.util.Scanner;

public class Operator6 {
	public static void main(String[] args) {
		System.out.println("조건연산자");
		
		String userId="m111";
		String userPw="1111";
							//조건1	&& 	조건2 -> 모든 조건이 true일때만 true
		System.out.println(userId.equals("m111") || userPw.equals("1111"));
		System.out.println(userId.equals("m111") || userPw.equals("2222"));
		System.out.println(userId.equals("1222") || userPw.equals("1111"));
		System.out.println(userId.equals("1222") || userPw.equals("1222"));
		System.out.println("=============");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("=============");
		System.out.println(!false);
		System.out.println(!true);
		
		
        Scanner scn = new Scanner(System.in);
 		
		System.out.print("아이디 : ");
		String id = scn.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = scn.nextLine();
		
		
		//id가 틀리거나 pw가 틀리거나
		if(!userId.equals(id) || !userPw.equals(pw) ) { //아이디가 m111이 아니거나 비밀번호가 1111이 아니거나 할때 true 이유 부정(!) 이니까
			System.out.println("로그인 실패, 아이디가 틀리거나, 비밀번호가 틀리거나, 둘다 틀리거나 ");
		}else {
			System.out.println("로그인 성공");
		}
		
		scn.close();
	}
}
