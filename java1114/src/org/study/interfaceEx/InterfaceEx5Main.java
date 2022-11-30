package org.study.interfaceEx;
interface A1{
	abstract void a1();
}

interface B1{
	abstract void b1();// abstract 있는 상태여서 써도 되고 안써도 된다.
}

class ABSub{
}				
						//클래스 extends 클래스 implements 인터페이스1, 인터페이스2
public class InterfaceEx5Main extends ABSub implements A1,B1 {

	@Override
	public void b1() {
		System.out.println("오버라이딩 b1");
	}

	@Override
	public void a1() {		
		System.out.println("오버라이딩 a1");
	}

	public static void main(String[] args) {
//		a1(); static 매소드는 static 맴버만 가능
		
	}
}
