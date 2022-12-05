package org.project.commend;

import java.util.Scanner;

import org.project.dao.MemberDao;

public class MemberDeleteCommed implements MemberCommed {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원탈퇴");

		Scanner input = new Scanner(System.in);

		System.out.print("아이디:");
		String userId = input.next();

		MemberDao dao = new MemberDao();
		int result = dao.deleteDo(userId);

		if (result != 0) {
			System.out.println("회원탈퇴 Success!!");
		} else {
			System.out.println("회원탈퇴 Fail!!");
		}
	}

}
