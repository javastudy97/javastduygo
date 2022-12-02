package org.study.commend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberInsertDo implements ExcuteQueryCommend{

	@Override
	public void excuteCommend() {
		System.out.println("회원가입");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("아이디:");
		String userId = input.next();
		System.out.println("비밀번호:");
		String userPw = input.next();
		System.out.println("나이:");
		int age = input.nextInt();
		System.out.println("이메일:");
		String email = input.next();

		MemberDao dao = new MemberDao();
		
		int result = dao.insertDo(userId, userPw, age, email);
		
		if(result!= 1) {
			System.out.println("회원가입 Fail!!");
		}else {
			System.out.println("회원가입 Success!!");
		}
	}
	
}
