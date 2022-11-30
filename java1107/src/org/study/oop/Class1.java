package org.study.oop;

public class Class1 {
	public String name;
	public int age;
	public static String title;
	public static final String PROJECTNAVE="JAVAPROJECT"; //파이널 상수
	
	public void instanceMethod() {
		System.out.println("인스턴스 매서드");
	}
	
	public static void classMethod() {
		System.out.println("클래스 매서드");		
	}
}
