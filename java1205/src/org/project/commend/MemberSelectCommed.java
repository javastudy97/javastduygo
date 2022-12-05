package org.project.commend;

import java.util.ArrayList;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class MemberSelectCommed implements MemberCommed {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원조회");
		
		MemberDao dao = new MemberDao();
		
		ArrayList<MemberDto> lists = dao.selectDo();
		
		if (lists != null) {
			System.out.println("회원 조회 성공!!");
			
			for (MemberDto list: lists) {
				System.out.print("아이디: "+ list.getUserId()+" ");
				System.out.print("비밀번호: "+ list.getUserPw()+" ");
				System.out.print("나이: "+ list.getAge()+" ");
				System.out.println("이메일: "+ list.getEmail());
			}
		}else {
			System.out.println("회원조회 실패!!");
		}
	}

}
