package org.study.Controller;

import java.util.Scanner;

import org.study.Commend.DBDeleteDo;
import org.study.Commend.DBInsertDo;
import org.study.Commend.DBSelectDo;
import org.study.Commend.DBUpdateDo;
import org.study.abstractEx.SQLQueryCommend;

public class DBController {

	public static void main(String[] args) {
		// Scanner
		// while(true)이용, if, switch 이용
		// "insert"면 콘솔에 회원가입
		// "update"면 콘솔에 회원수정
		// "delete"면 콘솔에 회원탈퇴
		// "select"면 콘솔에 회원조회

		org.study.Commend.SQLQueryCommend commed = null;

		Scanner input = new Scanner(System.in);

		boolean true1 = true;
		
		while (true1) {
			
			System.out.print("쿼리문 입력:");
			String query = input.next();

			switch (query) {
		
			case "insert":
			commed = new DBInsertDo();
			commed.excuteQueryCommend();
				break;
			case "delete":
			commed = new DBDeleteDo();
			commed.excuteQueryCommend();
				break;
			case "update":
			commed = new DBUpdateDo();
			commed.excuteQueryCommend();
				break;
			case "select":
			commed = new DBSelectDo();
			commed.excuteQueryCommend();	
				break;
			default:
				System.out.println("쿼리문 입력 오류");
				break;
			}
			break;
		}
	}

}
