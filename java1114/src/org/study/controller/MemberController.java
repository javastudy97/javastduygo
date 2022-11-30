package org.study.controller;

import java.util.Scanner;

import org.study.commed.CRUDCommend;
import org.study.commed.DBDeleteCommend;
import org.study.commed.DBInsertCommend;
import org.study.commed.DBSelectCommend;
import org.study.commed.DBUpdateCommend;

public class MemberController {

	public static void main(String[] args) {

		CRUDCommend commend = null;

		Scanner input = new Scanner(System.in);
		boolean bool = true;
		while (bool) {

			System.out.print("쿼리문 입력: ");
			String query = input.next();

			if (query.equals("insert")) {
				commend = new DBInsertCommend();
				commend.excuteCommend();
			} else if (query.equals("select")) {
				commend = new DBSelectCommend();
				commend.excuteCommend();
			} else if (query.equals("update")) {
				commend = new DBUpdateCommend();
				commend.excuteCommend();
			} else if (query.equals("delete")) {
				commend = new DBDeleteCommend();
				commend.excuteCommend();
			} else if (query.equals("exit")) {
				System.out.println("종료");
				bool = false; // false가 됨으로써 반복문 종료 break이랑 똑같음
// 			   break;
			} else {
				System.out.println("쿼리문 입력 오류! 다시입력!!");
			}
		}

	}
}
