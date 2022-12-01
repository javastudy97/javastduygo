package org.study.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		Connection conn = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system"; // user ID
		String password = "1234"; // user Password
		// 1. driver 찾기
		try {
			Class.forName(driver);
			System.out.println("Driver OK!!");
			// 2. DB연결 -> xe
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 Success!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 Fail");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB연결 Fail!");
		}

		return conn;
	}
}
