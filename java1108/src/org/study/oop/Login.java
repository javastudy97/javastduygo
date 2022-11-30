package org.study.oop;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
//Scanner이용해서 로그인
//저장 userId="m11", userPw="1111"
//로그인 실행 시
//아이디, 비밀번호를 입력 하고 userId="m11", userPw="1111"
//아이디와 비밀번호가 같으면 -> "로그인 성공" ->콘솔에 출력
//아이디와 비밀번호가 같지 않으면 -> "로그인 실패, 다시로그인 하세요"->콘솔에 출력
//로그인 실행하지 않으면 -> 종료

//while(true), 조건문(if) "로그인 하겠습니까?" 실행 -> 로그인 실행 실행하지않으면 0> 종료

		System.out.println("로그인");
		MemberDTO member = new MemberDTO();
		// 저장된 정보
		String userId = "m11";
		String userPw = "1111";

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.print("로그인 하겠습니까? (y or n) or(yes or no)");
			String order = input.next();

			if (order.equals("n") || order.equals("no")) {
				System.out.print("종료");
				break;

			} else if (order.equals("y") || order.equals("yes")) {

				System.out.print("아이디: ");
				member.setUserId(input.next());

				System.out.print("비밀번호: ");
				member.setUserPw(input.next());

				if (userId.equals(member.getUserId()) && userPw.equals(member.getUserPw())) {
					System.out.println("로그인 성공, 즐거운 쇼핑 되세요~");
					break;
				} else {
					System.out.println("로그인 실패, 다시로그인 하세요");
				}
			}else {
				System.out.println("입력오류 다시입력하세요~");
			}

		}
		input.close();
	}
}
