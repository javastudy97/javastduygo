package org.study.interfaceEx;

interface A{
	void a1();
}
interface A2{
	void a2();
}
interface B extends A, A2{
	void b1();
}

class AB implements B{ //무조건 추상메소드를 오버라이드를 시켜야함(즉, 구현해야함)

	@Override
	public void a1() {
		
	}

	@Override
	public void a2() {
		
	}

	@Override
	public void b1() {
		
	}
	
}

public class Interface4Main {

	public static void main(String[] args) {
		
		AB a= new AB();
		
	}
}
