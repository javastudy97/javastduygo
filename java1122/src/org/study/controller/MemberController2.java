package org.study.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.study.dto.MemberDto;

public class MemberController2 {

	public static void main(String[] args) {

		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		Scanner input = new Scanner(System.in);

		// exit가 입력되면 회원가입 종료.. -> 모든 회원 목록이 콘솔에 출력

		while (true) {
			System.out.println("종료하시겠습니까?");
			String order = input.next();
			
			if (order.equals("exit") || order.equals("종료")) {
				System.out.println("종료");

				for (MemberDto dto : lists) {
					System.out.println("회원명단");
					System.out.print("아이디: " + dto.getUserId() + " ");
					System.out.print("비밀번호: " + dto.getUserPw() + " ");
					System.out.print("이메일:" + dto.getEmail() + " ");
					System.out.println("나이 " + dto.getAge());
				}
				
				break;
				
			} else {

				System.out.println("회원가입");

				System.out.print("아이디 입력:");
				String userId = input.next();

				System.out.print("비밀번호 입력:");
				String userPw = input.next();

				System.out.print("이메일 입력");
				String email = input.next();

				System.out.print("나이 입력");
				int age = input.nextInt();

				lists.add(new MemberDto(userId, userPw, email, age));

			}
			
//			for (MemberDto dto : lists) {
//				System.out.println("회원명단");
//				System.out.print("아이디: " + dto.getUserId() + " ");
//				System.out.print("비밀번호: " + dto.getUserPw() + " ");
//				System.out.print("이메일:" + dto.getEmail() + " ");
//				System.out.println("나이 " + dto.getAge());
//			}
		}

	}
}
