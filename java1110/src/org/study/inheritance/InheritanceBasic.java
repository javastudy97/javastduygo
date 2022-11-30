package org.study.inheritance;

class Parent{
	
	public int num1;
	private int num2;
	protected String op;
	
	public Parent() {
		
	}
	
	public Parent(int num1) {
		this.num1=num1;
	}
	public void parentMethod() {
		System.out.println("parentMethod");
	}
}
class Son1 extends Parent{
	public int num3;
	
	public Son1() {
//		super(1000);
		System.out.println("Sol1");
	}
	@Override //부모의 매소드를 공유하면서 다르게 구현하는게 목적
	public void parentMethod() {
		System.out.println("자식parentMethod");
//		super.parentMethod();
	}
}

class Son2 extends Parent{
	public int num4;
	
//	public Son2() {
//		super(200);
//	}
	@Override
	public void parentMethod() {
		System.out.println("Son2Method");
	}
	
}

public class InheritanceBasic {
	
	public static void main(String[] args) {
		Parent p  = new Parent();
//		Parent p  = new Parent(100);
		Son1 s1  = new Son1();
		s1.parentMethod();
		
		Son2 s2 = new Son2();
		s2.parentMethod();
		
	}
}
