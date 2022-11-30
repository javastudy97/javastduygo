package org.study.polymorphism;

class A{
	int a;
}
class B extends A{
	int b;
	
}
class C extends B{
	int c;
}

public class PolymorphizeEx1 {
	public static void main(String[] args) {
		int i=10;
		
		A a = new A();
		a.a=11;
		A a2 = new B();
		a2.a=200;
		A a3 = new C();
		a3.a=10;
		
//		A a	= new A();
//		B b = new B();
//		C c = new C();
//		
//		a.a=10;
//		
//		b.a=10;
//		b.b=20;
//		
//		c.a=100;
//		c.b=200;
//		c.c=300;
//		
//		A a2 /*객체참조변수*/ = new B();
//		a2.a=200;
		
	
	}
}
