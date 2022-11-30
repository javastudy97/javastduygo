package org.study.controller;

import java.util.Scanner;

import org.study.commend.DBQueryCommend;
import org.study.commend.MemberDeleteCommend;
import org.study.commend.MemberInsertCommend;
import org.study.commend.MemberSelectCommend;
import org.study.commend.MemberUpdateCommend;

public class MemberController {

	public static void main(String[] args) {

		// Scanner 이용, while(true)
		// query -> insert면 콘솔에 "회원가입 Commend"
		// query -> delete면 콘솔에 "회원탈퇴 Commend"
		// query -> update면 콘솔에 "회원수정 Commend"
		// query -> select면 콘솔에 "회원조회 Commend"
		// query -> exit면 콘솔에 "종료 합니다."
		// query -> 나머지면 콘솔에 "입력쿼리 오류"

		// 다형성 이용해서 DBQueryCommend(부모타입)의 참조 변수를 이용
		// 상속을 통해서 excuteQueryCommend() 오버라이드 해서
		// 서브(자식)클래스를 객체를 이용해서 구현 하시오.

		DBQueryCommend action = null;
		String query = "";

		Scanner db = new Scanner(System.in);

		while (true) {

			System.out.print("종료하시겠습니까?(종료시 Exit)");
			String order = db.next();

			if (order.equals("exit") || order.equals("Exit")) {
				System.out.println("종료 합니다.");
				break;
			} else {
				System.out.println("쿼리문 입력실행");
				System.out.print("입력: ");
				query = db.next();
				

				if (query.equals("insert")) {
					action = new MemberInsertCommend();
					action.excuteQueryCommend();
				} else if (query.equals("delete")) {
					action = new MemberDeleteCommend();
					action.excuteQueryCommend();
				} else if (query.equals("update")) {
					action = new MemberUpdateCommend();
					action.excuteQueryCommend();
				} else if (query.equals("select")) {
					action = new MemberSelectCommend();
					action.excuteQueryCommend();
				} else {
					System.out.println("입력쿼리 오류");
				}

			}
		}

		db.close();
	}
}
