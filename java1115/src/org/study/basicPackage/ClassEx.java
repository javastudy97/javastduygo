package org.study.basicPackage;

public class ClassEx {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle연동 success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Oracle연동 fail");
		}
	}
}
