package org.java.variableEx;

public class VarEx01 {

	public static void main(String[] args) {
		// 1. 변수
		/*
		 1. 변수를 선언
		 2. 변수를 초기화 -> data를 추가
		 3. 변수를 메모리에 할당
		 */
		// java 기본 타입 primitive types
		
		//정수형
		byte b; // byte형의 변수 b를 선언했다.
		b=10; // 변수 b에 정수형 data 10으로 초기화 했다. -> 메모리에 할당
		
		byte b2=10; // byte형의 변수 b2를 선언하고 10으로 초기화 했다.
		short s=10;//short형의 변수 s를 선언하고 10으로 초기화 했다.
		int i=10;//int형의 변수 i를 선언하고 10으로 초기화 했다.
		long l=10;//long형의 변수 l을 선언하고 10으로 초기화 했다.
	
		//실수형, 기본타입 double
		float f=1.1f; //float형의 변수 f를 선언하고 1.1로 초기화 했다.double 형에서 float로 강제로 바꿔준다.
		double d=1.1; //double형 변수 d를 선언하고 1.1로 초기화 했다.
		
		//문자형
		char ch='a'; // char형 변수 ch를 선언하고 'a'로 초기화 했다.
		
		//논리형
		boolean bool=true;
		boolean bool2=false;
		
		bool=false;
		
		//콘솔에 출력
		
		System.out.println("자바의 기본 자료형");
		
		System.out.println(b);
		b=20;
		System.out.println(b);
		
		System.out.println(b2);			
		b2=50;
		System.out.println(b2);
		
		System.out.println(s);
		s=10;
		System.out.println(s);
		
		System.out.println(i);
		i=2000;
		System.out.println(i);
		
		System.out.println(l);
        l=3000000;
		System.out.println(l);
		
		System.out.println(f);
		f=1.54f;
		System.out.println(f);
		
		System.out.println(d);
		d=1.54;
		System.out.println(d);
		
		System.out.println(ch);
		ch='d';
		System.out.println(ch);
		
		System.out.println(bool);
		bool=false;
		System.out.println(bool);
		System.out.println(bool2);
		bool2=true;
		System.out.println(bool2);
		
		System.out.println("b2->"+b2);
		System.out.println("i->"+i);
		System.out.println("d->"+d);
		System.out.println("f->"+f);
		System.out.println("bool->"+bool);
		System.out.println("bool2->"+bool2);
		
		System.out.println(bool2);
		
		
		
		
		
		
	
		

		
		
	}
}
