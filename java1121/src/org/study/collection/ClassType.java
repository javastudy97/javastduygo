package org.study.collection;//패키지

import java.util.Date; //import java.lang 패키지는 자동적인 소속

//접근지정자 class 클래스명 {}-> 사용자 정의 타입
public class ClassType {
	//클래스의 맴버
	
	//필드,프로퍼티, 속성
	public int num1;
	public String name;
	public Object obj;
	public Date day;
	private String id;
	
	//생성자(contstruct)
	public ClassType() {
		System.out.println("기본생성자(기본생략)");
	}
	
	//매서드
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	
	
}
