package org.study.exception;

import java.io.IOException;
import java.sql.SQLException;

public class Sql1 implements SqlCommend {

	@Override
	public void excuteQueryCommend() 
			throws IOException, SQLException, ClassNotFoundException {
		System.out.println("회원 가입");
		String driver ="oracle.jdbc.driver.OracleDriver";
		Class.forName(driver);
		System.out.println("드라이버 OK");
	}

}
