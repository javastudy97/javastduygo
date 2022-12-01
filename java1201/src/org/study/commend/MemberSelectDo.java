package org.study.commend;

import java.util.ArrayList;

import org.study.dao.MemberDao;
import org.study.dto.MemberDto;

public class MemberSelectDo implements Excutecommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원조회");
		
		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> lists = dao.selectDo();
		
		if(lists!=null) {
			System.out.println("회원조회 Success!!");
			// lists모든 요소를 출력
			for(MemberDto list : lists) {
				System.out.print("아이디: "+list.getUserId()+" ");
				System.out.print("비밀번호: "+list.getUserPw()+" ");
				System.out.println("나이: "+list.getAge());
			}
		
		}else {
			System.out.println("회원조회 fail!!");
		}
	}

	

}
