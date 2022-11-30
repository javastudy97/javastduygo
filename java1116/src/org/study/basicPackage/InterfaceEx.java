package org.study.basicPackage;

interface A0{
	abstract public void m1();
}
interface A1{
//	public final int MAXNUM=100;
	int MAXNUM = 100;
//	abstract void ab1();
	void ab1();
	
	default void d1() {
		System.out.println("default");
	}
//	void int1() {
//		System.out.println("인스턴스매서드");
//	} 인터페이스는 인스턴스 맴버 생성 불가
}
interface B2 extends A1,A0{
	abstract public void m2();
}

class MainClass implements B2{

	@Override
	public void ab1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceEx {
	public static void main(String[] args) {
		
		new A0() {

			@Override
			public void m1() {
				// TODO Auto-generated method stub
				
			}
			
		}; //무명클래스
		
		MainClass m1 = new MainClass();
		m1.ab1();
		m1.d1();
		m1.m1();
		m1.m2();
		
		A0 a0 = new MainClass();
		a0.m1();
		A1 a1 = new MainClass();
		a1.ab1();
		a1.d1();
		
	}
}
