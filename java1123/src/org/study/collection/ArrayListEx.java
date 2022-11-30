package org.study.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {

//		ArrayList<Integer> lists = new ArrayList<Integer>();
		ArrayList<Integer> lists = new ArrayList<>();
		lists.add(new Integer(10));
		lists.add(20);
		lists.add(30);
		lists.add(40);
		lists.add(50);

		for (Integer i : lists) {
			System.out.println(i);
		}
		System.out.println();
		ArrayList<MemberDto> users = new ArrayList<MemberDto>();

		Scanner input = new Scanner(System.in);

		users.add(new MemberDto("m1", "emali1", "01011111111", 11));
		users.add(new MemberDto("m2", "emali2", "01011111112", 21));
		users.add(new MemberDto("m3", "emali3", "01011111113", 31));
		users.add(new MemberDto("m4", "emali4", "01011111114", 41));
		users.add(new MemberDto("m5", "emali5", "01011111115", 51));

		boolean bool1 = false;
		int index = 0;
		
//		while (!bool1) {
//			
//			while(true) {
//				if(index>=5) {
//					System.out.println("회원가입 종료");
//					bool1=true;
//					break;
//				}else {
//					
//					System.out.println(index);
//					System.out.println("회원가입 실행");
//					
//					System.out.println("아이디 입력:");
//					String userId = input.next();
//					System.out.println("이메일 입력:");
//					String email = input.next();
//					System.out.println("전화번호 입력:");
//					String phone = input.next();
//					System.out.println("나이 입력:");
//					int age = input.nextInt();
//					
//					users.add(new MemberDto(userId, email, phone, age));
//					
//					System.out.println("전체회원 목록");
//					
//					for (MemberDto user : users) {
//						System.out.print("아이디:" + user.getUserId() + " ");
//						System.out.print("이메일:" + user.getEmail() + " ");
//						System.out.print("전화번호:" + user.getPhone() + " ");
//						System.out.println("나이:" + user.getAge());
//
//					}
//				}
//				index++;
//				
//				
//			}
//
//		}
		for (MemberDto user : users) {
			System.out.print("아이디:" + user.getUserId() + " ");
			System.out.print("이메일:" + user.getEmail() + " ");
			System.out.print("전화번호:" + user.getPhone() + " ");
			System.out.println("나이:" + user.getAge());

		}
		
		boolean bool2 = false;
		while(!bool2) {
			System.out.println("로그인 실행");
			
			System.out.print("아이디 입력:");
			String userId2 = input.next();
			
			System.out.print("이메일 입력:");
			String email2 = input.next();
			
			for (MemberDto user : users) {
				String id =user.getUserId();
				String email =user.getEmail();
				System.out.println(id+","+email);
				
				if(id.equals(userId2)&&email.equals(email2)) {
					System.out.println("로그인 성공");
					bool2=true;
					break;
				}else {
					System.out.println("로그인 실패");
					System.out.println("로그인 다시 실행");
				}
				
			}
//			break;
		}

	}
}
