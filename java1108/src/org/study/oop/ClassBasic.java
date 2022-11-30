package org.study.oop;

public class ClassBasic {
	
	//맴버
	//필드 -> 속성,프로퍼티
	//인스턴스 맴버
	public int age;
	public String userName;
	public String userPw;
	private String userPhone;
	
	//클래스 맴버
	public static final String PROJECTNAME="JAVA2022";
	
	//매서드
	//인스턴스 맴버
	public void intstanceMethod() {
		System.out.println("인스턴스매서드");		
	}
	//클래스 맴버
	public static void classMethod() {
		System.out.println("클래스매서드");
		}
}
