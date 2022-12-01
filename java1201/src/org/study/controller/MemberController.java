package org.study.controller;

import java.util.Scanner;

import org.study.commend.Excutecommend;
import org.study.commend.MemberDeleteDo;
import org.study.commend.MemberInsertDo;
import org.study.commend.MemberSelectDo;
import org.study.commend.MemberUpdateDo;

public class MemberController {

	public static void main(String[] args) {

		System.out.println("CRUD");

		Scanner input = new Scanner(System.in);
		String query = "";

		Excutecommend commend = null;

		while (true) {
			System.out.print("쿼리문을 입력하세요:");
			
			query = input.next();
			if (query.equals("insert")) {
				commend = new MemberInsertDo();
				commend.excuteQueryCommend();
			} else if (query.equals("select")) {
				commend = new MemberSelectDo();
				commend.excuteQueryCommend();
			} else if (query.equals("update")) {
				commend = new MemberUpdateDo();
				commend.excuteQueryCommend();
			} else if (query.equals("delete")) {
				commend = new MemberDeleteDo();
				commend.excuteQueryCommend();
			} else if (query.equals("exit")) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("쿼리문 입력 오류~ 다시입력 해주세요");
			}
		}

	}
}
