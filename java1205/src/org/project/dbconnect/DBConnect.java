package org.project.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection() {
		Connection conn = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String passward = "1234";
		
		try {
			Class.forName(driver);
			System.out.println("Driver Ok!!");
			
			conn=DriverManager.getConnection(url, user, passward);
			System.out.println("DB connect Ok!!");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Null!!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB connect fail!!");
			e.printStackTrace();
		}
		
		return conn;
	}
}
