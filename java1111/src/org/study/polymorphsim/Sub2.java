package org.study.polymorphsim;

public class Sub2 extends Parent{

	public int num2;
	
	@Override
	public void excuteQueryCommen() {
		System.out.println("오버라이딩 Sub2");
		
	}
	
	public void m2() {
		System.out.println("인스턴스 m2");
	}
}
