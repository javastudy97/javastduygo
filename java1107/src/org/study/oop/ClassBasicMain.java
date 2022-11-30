package org.study.oop;

public class ClassBasicMain {
	
	//main -> 매서드
	//접근지정자 static(클래스매서드) 반환타입 main(String[] args)
	public static void main(String[] args) {
		
		//주소값이 스택의 한공간에 생긴다.
		//생성자
		//타입은 클래스타입을 가져다 쓴다.
		
		int i=10;
					//객체생성연산자- 주소값을 생성
					// new -> 인스턴스화(객체)
		ClassBasic c1 = new ClassBasic();
		//c1 -> 객체참조변수 -> 객체
		
		c1.userId="m111";
		c1.userPw="1111";
		c1.age=20;
		
		System.out.println(c1);
		System.out.println("id:"+c1.userId);
		System.out.println("password:"+c1.userPw);
		System.out.println("age:"+c1.age);
		
		//ClassBasic 타입에 객체를 생성하고 c2(객체참조변수)를
		//이용해서 , userId-> "s111" , userPw-> "22222", age=30 초기화하고
		// 콘솔에
//		id: s111
//		password: 22222
//		age:30
		//
		System.out.println(" ");
		
		ClassBasic c2 = new ClassBasic();
		
		c2.userId="s111";
		c2.userPw="1111";
		c2.age=30;
		
		System.out.println(c2);
		System.out.println(c2.getClass());
		System.out.println("id:"+c2.userId);
		System.out.println("password:"+c2.userPw);
		System.out.println("age:"+c2.age);
		
		System.out.println(" ========");
		
		ClassBasic c3=new ClassBasic();
		System.out.println(c3.getClass());
		c3.userId="s111";
		c3.userPw="2222";
		c3.age=35;
		System.out.println("id:"+c3.userId);
		System.out.println("password:"+c3.userPw);
		System.out.println("age:"+c3.age);
		
		
		
		
		
		
		
		
	}
}
