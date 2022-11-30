package org.study.controller;

import java.util.ArrayList;
import java.util.Iterator;

import org.study.dto.MemberDto;

public class MemberController {

	public static void main(String[] args) {
		
		
	//ArrayLlst생성, 요소는 MemberDto
	ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
	
	//lists요소 5개생성 추가 MemberDto userId는 중복되는 안된다.
	lists.add(new MemberDto("khr", "1120", "11@gmail.com", 26));
	lists.add(new MemberDto("kk1", "1121", "12@gmail.com", 27));
	lists.add(new MemberDto("k34", "1122", "13@gmail.com", 28));
	lists.add(new MemberDto("k56", "1123", "14@gmail.com", 29));
	lists.add(new MemberDto("k78", "1124", "15@gmail.com", 30));
	System.out.println("================");
	//for문, foreach문 콘솔에 출력
	System.out.println("for문==================");
	
	for(int i=0; i<lists.size(); i++) {
		System.out.print("아이디: "+lists.get(i).getUserId()+" ");
		System.out.print("비밀번호: "+lists.get(i).getUserPw()+" ");
		System.out.print("이메일: "+lists.get(i).getEmail()+" ");
		System.out.println("나이: "+lists.get(i).getAge()+" ");
	}
	
	
	System.out.println("foreach문==================");
	for(MemberDto dto: lists) {
		System.out.print("아이디: "+dto.getUserId()+" ");
		System.out.print("비밀번호: "+dto.getUserPw()+" ");
		System.out.print("이메일: "+dto.getEmail()+" ");
		System.out.println("나이: "+dto.getAge()+" ");
		
	}
	System.out.println();
	
	System.out.println("Iterator문==================");
	Iterator<MemberDto> iter = lists.iterator();
	
	while(iter.hasNext()) {
		MemberDto dto =  iter.next();
		System.out.print("아이디: "+dto.getUserId()+" ");
		System.out.print("비밀번호: "+dto.getUserPw()+" ");
		System.out.print("이메일: "+dto.getEmail()+" ");
		System.out.println("나이: "+dto.getAge()+" ");
	}

	//아이디: ~, 비밀번호:~, 이메일: ~, 나이: ~
	
	
	}
}
