package org.study.DBMemerCoroller;

import java.util.Scanner;

import org.study.DBMemerCommend.MemberjoinCommend;
import org.study.DBMemerDto.MemberDTO;

public class MemberController {

	public static void main(String[] args) {

		MemberjoinCommend commend1 = new MemberjoinCommend();
		MemberjoinCommend commend2 = new MemberjoinCommend("제목1");

		// 회원가입 MemberDTO

//		MemberDTO member1 = new MemberDTO("m1", "11", 11, "s1", "서울시 도봉구");
//		MemberDTO member2 = new MemberDTO("m2", "22", 22, "s2", "서울시 노원구");
//		MemberDTO member3 = new MemberDTO("m3", "33", 33, "s3", "서울시 성북구");
//		MemberDTO member4 = new MemberDTO("m4", "44", 44, "s4", "서울시 강북구");
//		MemberDTO member5 = new MemberDTO("m5", "55", 55, "s5", "서울시 중랑구");

//		String userId = member1.getUserId();
//		String userPw = member1.getUserPw();
//		
//		System.out.println(userId);
//		System.out.println(userPw);
//		
//		if(userId.equals("m111")&&userPw.equals("1111")) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}

//		member1.getMemberDto();
//		member2.getMemberDto();
//		member3.getMemberDto();
//		member4.getMemberDto();
//		member5.getMemberDto();

//		System.out.print(member1.getUserId()+", ");
//		System.out.print(member1.getUserPw()+", ");
//		System.out.print(member1.getUserAge()+", ");
//		System.out.print(member1.getUserName()+", ");
//		System.out.println(member1.getUserAddr());
//		
//		System.out.println();
//		
//		System.out.print(member2.getUserId()+", ");
//		System.out.print(member2.getUserPw()+", ");
//		System.out.print(member2.getUserAge()+", ");
//		System.out.print(member2.getUserName()+", ");
//		System.out.println(member2.getUserAddr());
//		
//		System.out.println();
//		
//		System.out.print(member3.getUserId()+", ");
//		System.out.print(member3.getUserPw()+", ");
//		System.out.print(member3.getUserAge()+", ");
//		System.out.print(member3.getUserName()+", ");
//		System.out.println(member3.getUserAddr());
//		
//		System.out.println();
//		
//		System.out.print(member4.getUserId()+", ");
//		System.out.print(member4.getUserPw()+", ");
//		System.out.print(member4.getUserAge()+", ");
//		System.out.print(member4.getUserName()+", ");
//		System.out.println(member4.getUserAddr());
//		
//		System.out.println();
//		
//		System.out.print(member5.getUserId()+", ");
//		System.out.print(member5.getUserPw()+", ");
//		System.out.print(member5.getUserAge()+", ");
//		System.out.print(member5.getUserName()+", ");
//		System.out.println(member5.getUserAddr());

		Scanner input = new Scanner(System.in);
		System.out.println("회원가입");

		System.out.print("아이디:");
		String userId = input.next();

		System.out.print("비밀번호:");
		String userPw = input.next();

		System.out.print("나이:");
		int userAge = input.nextInt();

		System.out.print("이름:");
		String userName = input.next();

		input.nextLine();
		System.out.print("주소:");
		String userAddr = input.nextLine();
		
		input.close();
		
		MemberDTO member6 = new MemberDTO(userId, userPw, userAge, userName, userAddr);
		member6.getMemberDto();
	
		
	}	
	
		
}
