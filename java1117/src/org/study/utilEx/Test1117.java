package org.study.utilEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1117 {
	public static void main(String[] args) {
		//그냥 따라 해보기
		//try~catch 예외처리 부분인데 강사님께서 따라해보라고 하심
//		try {
//			//class를 찾는~ Oracle JDBC드라이버
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("Oracle Driver Connect Seccess!!");
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("Oracle Driver Connect Fail!!");			
//		}
		//1.날짜
		Date now = new Date();
		//2.포맷
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//3.포맷(날짜) ->
		String day1 = sdf.format(now);
		
		System.out.println(day1);
		
		
		
		
		
		
		
	}
}
