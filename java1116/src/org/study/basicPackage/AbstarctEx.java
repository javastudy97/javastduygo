package org.study.basicPackage;

abstract class Ab1{
	int num;
	
	//추상매서드
	//선언부는 있고
	abstract void m1();//구현X
}
abstract class B extends Ab1{
	abstract void m2();
}

class A extends Ab1{
	int num2;
	@Override
	void m1() {
		System.out.println("추상매서드 오버라이드");
	}
	
}
public class AbstarctEx {

	public static void main(String[] args) {
		A a= new A();
		a.num=100;
		a.m1();
		Ab1 ab1 = new A();
		ab1.num=100;
		ab1.m1();
	}
}
