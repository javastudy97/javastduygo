package org.study.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.study.dto.MemberDto;

public class MemberController3 {

	public static void main(String[] args) {

		// Scanner 이용 아이디, 비밀번호, 이메일, 나이
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		
		lists.add(new MemberDto("m1", "11", "m1@gamil.com", 11));
		
		String userId = lists.get(0).getUserId();
		String userPw = lists.get(0).getUserPw();
		
		Scanner input = new Scanner(System.in);
		System.out.print("아이디 입력: ");
		String id = input.next();
		System.out.print("비밀번호 입력: ");
		String pw = input.next();
		
		if(userId.equals(id) && userPw.equals(pw)) {
			System.out.println("LOGIN Success!!");
		}else {
			System.out.println("LOGIN Fail!!");
		}

	}
}
