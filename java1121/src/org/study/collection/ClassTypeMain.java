package org.study.collection;//패키지

import java.util.Date; //import java.lang 패키지는 자동적인 소속

//접근지정자 class 클래스명 {}
public class ClassTypeMain {
	
	public static void main(String[] args) {
		
		
	    //객체생성
		ClassType c1 = new ClassType();
		//타입	객체참조변수(객체의 주소저장)
		
		//기본타입(premitive)
		c1.num1=100;
		//객체타입
		//c1.name= new String("이름"); //. -> 접근연산자
		c1.name= "이름"; //. -> 접근연산자
		c1.obj= new Object();
		c1.day= new Date(); //담을 객체가 아무것도 없어서 예외나 에러가 뜸
		
		//private 맴버 -> setter,getter
		c1.setId("m1");
		c1.getId();
		
	}
	
}
