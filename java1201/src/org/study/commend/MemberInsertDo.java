package org.study.commend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberInsertDo implements Excutecommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원가입");
		
	Scanner input=new Scanner(System.in);
	
	System.out.print("아이디: ");
	String userId=input.next();
	System.out.print("비밀번호: ");
	String userPw=input.next();
	System.out.print("나이: ");
	int age = input.nextInt();
	
	MemberDao dao = new MemberDao();
	
	int result = dao.inserDo(userId, userPw, age);
	
	if(result!=1) {
		System.out.println("회원가입 Fail!!");
	}else {
		System.out.println("회원가입 Succss!!!");
	}
	
	
	
	}

	

}
