package org.study.inheritance;

class A{
	public int num1;
	private int num2;
	protected int num3;
	
	public A() {
		super();
	}
	
	public A(String name) {
		System.out.println(name);
	}
	public void method1() {
		System.out.println("A method1");
	}
}
class B extends A{
	int num4;
//	public B() {
//		super();
//	}
	
//	public B() {
//		super("문자열");
//		System.out.println("B생성자");
//	}
	
	
	@Override
	public void method1() {
		System.out.println("오버라이드 B method1");
		
	}
}
public class InheritanceEx {
	
	public static void main(String[] args) {
		
		A a = new B();
		a.num1=10;
		a= new B();
		
		
		
//		A a = new A();
//		a.num1=10;
//		a.num3=20;
//		a.method1();
//		
//		B b = new B();
//		b.num1=100;
//		b.num3=200;
//		b.num4=300;
//		b.method1();
		
		A b = new B();
		
	}
	
}
