package org.study.controller;

import java.util.Scanner;

import org.study.commend.ExcuteQueryCommend;
import org.study.commend.MemberDeleteDo;
import org.study.commend.MemberInsertDo;
import org.study.commend.MemberSelectDo;
import org.study.commend.MemberUpdateDo;

public class MemberController {

	public static void main(String[] args) {
		System.out.println("CRUD");
		Scanner input = new Scanner(System.in);
		String query = "";

		ExcuteQueryCommend commed = null;

		while (true) {
			System.out.print("쿼리문입력: ");
			query = input.next();
			
			if (query.equals("insert")) {
				commed = new MemberInsertDo();
				commed.excuteCommend();
			} else if (query.equals("update")) {
				commed = new MemberUpdateDo();
				commed.excuteCommend();
			} else if (query.equals("delete")) {
				commed = new MemberDeleteDo();
				commed.excuteCommend();
			} else if (query.equals("select")) {
				commed = new MemberSelectDo();
				commed.excuteCommend();
			} else if (query.equals("exit")) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("쿼리문 입력오류!! 다시입력!!");
			}

		}
	}
}
