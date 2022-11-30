package org.study.basicPackage;

public class Test1116 {
	
	public static void main(String[] args) {
//		표준입출력 
		/*
		 System.in; //입력 
		 System.out;//출력
		//Class -> 특정 클래스 찾기, JDBC로드
		*/
		
		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("DB Connect success!");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("DB Connect Fail!!");
//		}
		
		int i=10;
		Integer i1=new Integer(i);//박싱
		int i2=i1.intValue();//언박싱
		
		Integer j1=10;//자동박싱
		int a=new Integer(i); //자동언박싱
		
		//String 문자열, 수정 X
		
		String str= "java 2022 Project";
		System.out.println(str);
		System.out.println(str.charAt(2)); //한단어씩 뽑는거
		System.out.println(str.contains("2")); //2가 포함되있느냐?
		System.out.println(str.contains("z")); //z가 포함되있느냐?
		System.out.println(str.replace("java", "Oracle")); //'java' 문자열에서 'Oracle'로 변경
		System.out.println(str);
		
		String[] arrStr=str.split(" "); // str 문자열을 공백으로 구분해서 배열화
		
		System.out.println(arrStr.length); // 문자열 길이 출력
		System.out.println("foreach=======");
		
		for(String arr:arrStr) {
			System.out.println(arr);
		}
		System.out.println("for=======");
		
		for(int j=0;j<arrStr.length;j++) {
			System.out.println(arrStr[j]);
		}
		
		//java 2022 Project
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.substring(0)); //시작인덱스 부터 추출
		System.out.println(str.substring(5)); 
		System.out.println(str.substring(0,5)); //시작인텍스~마지막인덱스-1 
		
		System.out.println(str);
		
	}
}
