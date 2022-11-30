package org.study.Innerclass;

interface A{
	void ab1();
}
class A1 implements A{
	@Override
	public void ab1() {
		System.out.println("오버라이딩ab1");
	}
}
public class AnorymouseClass1 {

	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.ab1();
		
		//익명(무명) 클래스
		new A() {
			@Override
			public void ab1() {
				System.out.println("오버라이딩2");
			}
			
		};
		
		
	}
}
