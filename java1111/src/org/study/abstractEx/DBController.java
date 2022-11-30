package org.study.abstractEx;

import java.util.Scanner;

public class DBController {
	public static void main(String[] args) {

//		 SQLQueryCommend delete = new DBDeleteDo();
//		 delete.excuteQueryCommend();
//		 
//		 SQLQueryCommend insert = new DBInsertDo();
//		 insert.excuteQueryCommend();
//
//		 SQLQueryCommend update = new DBUpdateDo();
//		 update.excuteQueryCommend();
//
//		 SQLQueryCommend select = new DBSelectDo();
//		 select.excuteQueryCommend();

		// Scanner
		// while(true)이용, if, switch 이용
		// "insert"면 콘솔에 회원가입
		// "update"면 콘솔에 회원수정
		// "delete"면 콘솔에 회원탈퇴
		// "select"면 콘솔에 회원조회

		SQLQueryCommend action = null;
		Scanner input = new Scanner(System.in);

		/*
		 * while (true) { System.out.print("실행 하시겠습니까?"); String order = input.next();
		 * if (order.equals("exit")) { System.out.println("종료합니다."); } else {
		 * System.out.print("쿼리문 입력: "); String query = input.next();
		 * 
		 * if (query.equals("insert")) { action = new DBInsertDo();
		 * action.excuteQueryCommend(); } else if (query.equals("update")) { action =
		 * new DBUpdateDo(); action.excuteQueryCommend(); } else if
		 * (query.equals("delete")) { action = new DBDeleteDo();
		 * action.excuteQueryCommend(); } else if (query.equals("select")) { action =
		 * new DBSelectDo(); action.excuteQueryCommend(); } else {
		 * System.out.println("쿼리문 입력 오류"); }
		 * 
		 * } }
		 */

		while (true) {
			System.out.print("쿼리문 입력");
			String query = input.next();

			switch (query) {

			case "insert": 
				action = new DBInsertDo();
				action.excuteQueryCommend();
				break;
			case "update":
				action = new DBUpdateDo();
				action.excuteQueryCommend();
				break;
			case "delete":
				action = new DBDeleteDo();
				action.excuteQueryCommend();
				break;
			case "select":
				action = new DBSelectDo();
				action.excuteQueryCommend();
				break;
			default:
				System.out.println("쿼리문입력 오류");
			}
		}
	}
}
