package org.study.commend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberDeleteDo implements Excutecommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원탈퇴");
		Scanner input = new Scanner(System.in);

		System.out.print("아이디: ");
		String userId = input.next();
		
		MemberDao dao = new MemberDao();
		int result = dao.deleteDo(userId);
		
		if(result != 1) {
			System.out.println("회원탈퇴 Fail");
		}else {
			System.out.println("회원탈퇴 Success!!");
		}
		
	}

	

}
