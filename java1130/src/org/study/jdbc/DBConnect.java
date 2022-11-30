package org.study.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static void main(String[] args) {

		Connection conn = null; // DB연결
		String driver = "oracle.jdbc.driver.OracleDriver";// 오라클 드라이버
		String url = "jdbc:oracle:thin:@localhost:1521:xe";// 오라클 기본 DB
		String user = "system"; // user ID
		String password = "1234";// user Password
		// 1. driver 찾기
		try {
			Class.forName(driver);
			System.out.println("드라이버 OK!");
			// 2. DB연결 -> xe
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 sccess!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 Fail!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB연결 Fail!!");
		}
		System.out.println(conn);
		
		if(conn!=null) {
			System.out.println("오라클 연동 성공");
		}else {
			System.out.println("오라클 연동 실패");
		}
	}
}
