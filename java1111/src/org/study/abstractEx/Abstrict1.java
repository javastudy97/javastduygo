package org.study.abstractEx;

//추상 매서드가 있는 추상 클래스
public abstract class Abstrict1 {
	
	int num1;
	//추상 매서드 -> 미완성 매서드, 선언부만 있고 구현부가 없다.
	//구현 객체에 상속을 상속을 통해서 강제로(반드시) 매서드를 오버라이딩을 통해서 구현
	public abstract void abstractM1();
	public abstract void abstractM2(String name); 
	
	public void m1() {
		System.out.println("m1매서드(일반)");
	}
}
