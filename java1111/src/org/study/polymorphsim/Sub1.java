package org.study.polymorphsim;

public class Sub1 extends Parent{

	public int num1;
	
	@Override
	public void excuteQueryCommen() {
		System.out.println("오버라이딩 Sub1");
		
	}
	
	public void m1() {
		System.out.println("인스턴스 m1");
	}
}
