package org.java.variableEx;

public class VarEX02 {

	public static void main(String[] args) {
		System.out.println("===자바의 객체형 타입===");
		
		//객체 생성 -> 주소값(임의의)
		String str1=new String();//String -> 문자열""
		str1="문자열 data";
		String str2="문자열2 data";// new를 생략 할 수 있다.
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();
		System.out.println(str2.length());
		
		//클래스(사용자정의 타입//BasicClass 객체생성
		BasicClass class1 = new BasicClass();
		

	}
}
