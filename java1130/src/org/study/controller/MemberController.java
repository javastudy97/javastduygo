package org.study.controller;

import java.util.Scanner;

import org.study.commend.MemberCommend;
import org.study.commend.MemberDeleteDo;
import org.study.commend.MemberInsertDo;
import org.study.commend.MemberSelectDo;
import org.study.commend.MemberUpdateDo;

public class MemberController {

	public static void main(String[] args) {

		// Controller ->
		// 1.사용자 요청(Request) 받아서
		// 2.일을 시키고
		// 3.결과 받아서 반환값을 이용해서
		// 4.다시 View로 응답(Response)

		Scanner input = new Scanner(System.in);
		String query = "";

		while (true) {
			System.out.println("SQL문을 입력하세요.(insert,update,select,delete)");
			query = input.next();
			MemberCommend commend = null;

			if (query.equals("insert")) {
				commend = new MemberInsertDo();
				commend.excuteQueryCommend();
			} else if (query.equals("update")) {
				commend = new MemberUpdateDo();
				commend.excuteQueryCommend();
			} else if (query.equals("delete")) {
				commend = new MemberDeleteDo();
				commend.excuteQueryCommend();
			} else if (query.equals("select")) {
				commend = new MemberSelectDo();
				commend.excuteQueryCommend();
			} else if (query.equals("exit")) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("SQL입력 오류~ 다시입력!!");
			}

		}
	}
}
