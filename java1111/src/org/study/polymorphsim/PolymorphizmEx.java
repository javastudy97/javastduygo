package org.study.polymorphsim;

class A{
	int num1;
}
class B extends A{
	int num2;
}
class C extends B{
	int num4;
}

public class PolymorphizmEx {
	public static void main(String[] args) {

		A a=new C();
		a.num1=10;
		
		B b=new C();
		b.num1=20;
		b.num2=30;
		
		C c=new C();
		c.num1=100;
		c.num2=200;
		c.num4=400;
		
		
//		A a1= new A();
//		a1.num1=10;
//		A a2 =new B();
//		a2.num1=200;
//		A a3=new C();
//		a3.num1=300;
//		
//		B b=new C();
//		b.num1=200;
//		b.num2=200;
//		
//		C c=new C();
//		c.num1=300;
//		c.num2=400;
//		c.num4=500;
		
		
		
	}
}
