package org.study.abstractEx;

//추상 매서드가 있는 추상 클래스
public abstract class AbstrictMain {

	public static void main(String[] args) {
		
	Abstract1Sub1 a1 = new Abstract1Sub1();
		a1.abstractM1();
		a1.abstractM2("추상매서드2");
	
		
		Abstract1Sub1SubSub a2  = new Abstract1Sub1SubSub();
		a2.abstractM1();
		a2.abstractM2("a1");
		a2.abstractM3();
		
		
		//다형성 -> 부모타입의 객체참조변수에 자식 객체에 접근
		
		//다형성 성립
		Abstrict1 a3 = new Abstract1Sub1SubSub();
		
		a3.abstractM1();
		a3.abstractM2("name");
		a3.m1();
		
		//구현 객체간의 상속관계 없으면 다형성이 성립하지 않은다.
//		Abstract1Sub1 a4 = new Abstract1Sub1SubSub();
		
		
		
		
		
		
	}
}
