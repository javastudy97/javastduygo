package org.study.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnect {

	public static Connection getConnection() {
		Connection conn = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		try {
			// 1. driver 찾기
			Class.forName(driver);
			System.out.println("Driver OK!!");
			// 2. DB연동
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB Connect Success!!");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Null!!");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB Connect Fail!!");
		} 

		return conn;
	}
}
