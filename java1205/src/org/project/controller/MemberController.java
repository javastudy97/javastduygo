package org.project.controller;

import java.util.Scanner;

import org.project.commend.MemberCommed;
import org.project.commend.MemberDeleteCommed;
import org.project.commend.MemberInsertCommed;
import org.project.commend.MemberSelectAgeDo;
import org.project.commend.MemberSelectCommed;
import org.project.commend.MemberUpdateCommed;

public class MemberController {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		MemberCommed commed = null;
		boolean order = false;
		
		while(!order) {
			System.out.print("쿼리문 입력(insert,update,select,delete,selectAge) exit 입력시 종료:");
			String query = input.next();
			
			switch (query) {
			case "insert":
				commed = new MemberInsertCommed();
				commed.excuteQueryCommend();
				break;
			case "update":
				commed = new MemberUpdateCommed();
				commed.excuteQueryCommend();
				break;
			case "delete":
				commed = new MemberDeleteCommed();
				commed.excuteQueryCommend();
				break;
			case "select":
				commed = new MemberSelectCommed();
				commed.excuteQueryCommend();
				break;
			case "selectAge":
				commed = new MemberSelectAgeDo();
				commed.excuteQueryCommend();
			case "exit":
				System.out.println("종료");
				order = true;
				break;
			default:
				System.out.println("입력오류 다시입력!!");
				break;
			}
			
		}
	}
}
