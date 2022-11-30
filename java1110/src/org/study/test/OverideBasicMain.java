package org.study.test;

import java.util.Scanner;

public class OverideBasicMain {
	
	public static void main(String[] args) {
		
//		ActionQueryInsert Insert = new ActionQueryInsert();
//		Insert.excuteQuery();
//		ActionQueryUpdate Update = new ActionQueryUpdate();
//		Update.excuteQuery();
//		ActionQueryDelete Delete = new ActionQueryDelete();
//		Delete.excuteQuery();
//		ActionQuerySelect Select = new ActionQuerySelect();
//		Select.excuteQuery();		
	
//		OverideBasic action = new ActionQueryInsert();
//		action.excuteQuery();
//		action = new ActionQueryDelete();
//		action.excuteQuery();
//		action = new ActionQueryUpdate();
//		action.excuteQuery();
//		action = new ActionQuerySelect();
//		action.excuteQuery();
	
		//실제 프로젝트 구현 모델
		
		OverideBasic action = null;
		String query="";
		
		System.out.println("쿼리문 입력하세요");
		Scanner input = new Scanner(System.in);
		query = input.next();
		
		if(query.equals("insert")) {
			action = new ActionQueryInsert();
			action.excuteQuery();
		}else if(query.equals("delete")) {
			action = new ActionQueryDelete();
			action.excuteQuery();
		}else if (query.equals("update")) {
			action = new ActionQueryUpdate();
			action.excuteQuery();
		}else if (query.equals("select")) {
			action = new ActionQuerySelect();
			action.excuteQuery();
		}else {
			System.out.println("SQL입력오류");
		}
		
		input.close();
	}
}
