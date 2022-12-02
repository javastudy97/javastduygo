package org.study.commend;

import java.util.ArrayList;

import org.study.dao.MemberDao;
import org.study.dto.MemberDto;

public class MemberSelectDo implements ExcuteQueryCommend {

	@Override
	public void excuteCommend() {
		System.out.println("회원조회");

		MemberDao dao = new MemberDao();

		ArrayList<MemberDto> members = dao.selectDo();

		if (members != null) {
			System.out.println("회원 조회 성공!!");

			for (MemberDto member : members) {
				System.out.print("아이디: " + member.getUserId() + " ");
				System.out.print("비밀번호: " + member.getUserPw() + " ");
				System.out.print("나이: " + member.getAge() + " ");
				System.out.println("이메일: " + member.getEmail());
			}
		} else {
			System.out.println("회원 조회 실패!!");
		}

	}

}
