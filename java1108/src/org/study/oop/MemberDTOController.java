package org.study.oop;

import java.util.Scanner;

public class MemberDTOController {
	public static void main(String[] args) {
		System.out.println("회원가입");
		// 예 Scanner이용해서 회원가입하고 회원가입 정보를 콘솔출력
		// 아이디, 비밀번호, 나이를 입력하고 -> 콘솔에 id: m11, password: m11, age:11
		// "exit" 입력되면 while문을 종료
		// while(true), 조건문(if)
		// 1)"회원가입 하겠습니까?" 실행->회원가입->회원출력 실행하지않으면-> 회원가입 종료
		// 2).close();
		MemberDTO men = new MemberDTO();
//		men.setUserId("m11");
//		men.setUserPw("m11");
//		men.setAge(15);
		Scanner scn = new Scanner(System.in);

		int i = 0;
		while (true) {
			System.out.print("회원가입을 실행하시겠습니까?, " + "종료시 Exit 또는 exit " + "계속 할꺼면 y 또는 yes키 입력");
			String order = scn.next();

			if (order.equals("exit") || order.equals("Exit")||order.equals("n")) {
				System.out.println("종료");
				break;
			} else if (order.equals("y") || order.equals("yes")) {

				System.out.print("아이디 입력: ");
//				String id=scn.next();
//				men.setUserId(id);
				men.setUserId(scn.next());

				System.out.print("비밀번호 입력: ");
//				String pw=scn.next();
//				men.setUserPw(pw);
				men.setUserPw(scn.next());

				System.out.print("나이 입력: ");
//				int age=scn.nextInt();
//				men.setAge(age);
				men.setAge(scn.nextInt());
				
				// 회원 출력
				System.out.println("회원 출력");
				System.out.println("id: " + men.getUserId());
				System.out.println("passward: " + men.getUserPw());
				System.out.println("age: " + men.getAge());

			}else {
				System.out.println("입력오류! 다시입력~~");
			}

			i++;
		}

		scn.close();

	}

}
