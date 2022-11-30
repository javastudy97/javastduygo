package org.study.Innerclass;

public class StaticClassMain {
	public static void main(String[] args) {
		System.out.println("static클래스");
		
		StaticClass.StaticBasic s1 = new StaticClass.StaticBasic();
		s1.age = 10;
		s1.name = "static클래스";
		
		System.out.println("나이: "+ s1.age);
		System.out.println("이름: "+ s1.name);
		
		StaticClass.StaticBasic.staticMethod();
	}
	
}
