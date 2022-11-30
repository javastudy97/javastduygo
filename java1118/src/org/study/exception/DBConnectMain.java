package org.study.exception;

import org.study.connect.DBConnect;

public class DBConnectMain {
	
	public static void main(String[] args) {
		//매서도 실행
		DBConnect.getConnection();
	}
}
