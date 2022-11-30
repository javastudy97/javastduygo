package org.study.thread;
//클래스의 맴버 -> 필드, 매서드, 생성자
//부모클래스
class A{
	//필드
	public int num;
	public int num2;
	public int num3;
	//생성자
	public A() {
		System.out.println("생성자(기본생성자)");
	}
	
	//매서드 -> 일하는~
	//선언부
	public void m1() {
		//구현부
		System.out.println("m1");
	}
}
//상속
class B extends A{
	
	@Override
	public void m1() {
		//구현부
		System.out.println("오버라이딩 m1");
	}
	
	 public void m2() {
		System.out.println("m2");
	}
}
//추상클래스 -> 추상매서드(미완성매서드 ->선언부만 있고 구현부가 없는 매서드0, 객체(new)X )
abstract class Ab1{
	public int num1;//인스턴스 맴버
	//추상매서드
	public abstract void abstractM1();
	public void m1() {
		System.out.println("m1");
	}
}

class Ab1Sub extends Ab1{

	@Override
	public void abstractM1() {
		System.out.println("추상매서드 오버라이딩(필수)");
	}
	@Override
	public void m1() {
		System.out.println("일반매서드 오버라이딩(선택)");
	}
}

//인터페이스 -> 맴버(추상매서드, final상수, default, static), 일반 맴버X, 객체 new X
interface In1{
	public static final int MAXNUM=1000;
	public abstract void ab1();
	default void defaultM() {
		System.out.println("default매서드");
	}
}

class In1Sub implements In1{

	@Override
	public void ab1() {
		System.out.println("추상매서드 ab1 오버라이딩-> 필수");
	}
	@Override
	public void defaultM() {
		System.out.println("default매서드 defaultM() 오버라이딩-> 선택");		
	}
}



public class RamdaEx2 {
	
	public static void main(String[] args) {
		A a1= new B();//다형성
		B b1= new B();
		 
		//익명클래스 -> 이름이 없는 클래스
		new A() {
			@Override
			public void m1() {
				System.out.println("오버라이딩m1_1");
			}
		}.m1();
		A a2 = new A() {
			@Override
			public void m1() {
				System.out.println("오버라이딩m1_2");
			}
		};
		a2.m1();
		
		
		System.out.println("==============");
//		A a3=()->{}; //람다식 반드시 인터페이스에서 구현 해줘야한다.
		//추상클래스 -> 이름이 없는 클래스
		
		new Ab1() {
			
			@Override
			public void abstractM1() {
				System.out.println("추상클래스 오버라이딩_1");
			}
		}.abstractM1();
		Ab1 ab2 = new Ab1() {
			@Override
			public void abstractM1() {
				System.out.println("추상클래스 오버라이딩_2");
			}
		};
		ab2.abstractM1();
		
		System.out.println("==============");
		//인터페이스 -> 이름이 없는 클래스
		
		new In1() {
			
			@Override
			public void ab1() {
				System.out.println("인터페이스_1");
			}
		}.ab1();
		
		In1 in2 = new In1() {
			@Override
			public void ab1() {
				System.out.println("인터페이스ab1_1");
			}
		};
		in2.ab1();
		
		System.out.println("=========람다식=====");
		//타입 변수=()->{};
		In1 in3 =()->{
			System.out.println("인터페이스ab_2");
			
		};
		in3.ab1();
		
	}
}



