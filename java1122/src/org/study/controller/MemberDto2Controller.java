package org.study.controller;

import java.util.ArrayList;
import java.util.Scanner;

import org.study.dto.MemberDto2;

public class MemberDto2Controller {

	public static void main(String[] args) {

		ArrayList<MemberDto2> userdata = new ArrayList<MemberDto2>();
		Scanner input = new Scanner(System.in);

		System.out.println("회원가입");

		userdata.add(new MemberDto2("김씨", "e1111@gmail.com", "010-1111-1111", 28));
		userdata.add(new MemberDto2("이씨", "e2222@gmail.com", "010-2222-2222", 35));
		userdata.add(new MemberDto2("박씨", "e3333@gmail.com", "010-3333-3333", 38));
		userdata.add(new MemberDto2("정씨", "e4444@gmail.com", "010-4444-4444", 41));
		userdata.add(new MemberDto2("유씨", "e5555@gmail.com", "010-5555-5555", 24));

		boolean result = false;
		boolean result2 = false;
		int index = 0;
		while (!result) {

			while (true) {
				if (index >= 5) {
					System.out.println(index);
					System.out.println("회원가입 종료");
					result = true;
					break;
				} else {

					String Id = userdata.get(index).getUserId();
					String email = userdata.get(index).getEmail();
					String phone = userdata.get(index).getPhone();
					int age = userdata.get(index).getAge();

					System.out.print("아이디:" + Id + " ");
					System.out.print("이메일:" + email + " ");
					System.out.print("전화번호:" + phone + " ");
					System.out.println("나이:" + age);

				}
				index++;
			}
		}

		while (!result2) {
			System.out.println("로그인 실행");
			System.out.print("아이디 입력:");
			String UserId = input.next();

			System.out.print("이메일 입력:");
			String Useremail = input.next();

			for (MemberDto2 user : userdata) {
				String Id =user.getUserId();
				String email=user.getEmail();
				
				if (Id.equals(UserId) && email.equals(Useremail)) {
					System.out.println("로그인 성공");
					result2 = true;
					break;
				}
				
			}
			
		}

	}
}
