package org.study.oop;

public class ClassBasicMain {
	
	public static void main(String[] args) {
		
		//클래스 맴버 적용
		
		System.out.println(ClassBasic.PROJECTNAME);//클래스맴버
		String classMember1 = ClassBasic.PROJECTNAME;
		System.out.println(classMember1);
		
		ClassBasic.classMethod();
		
		//인스턴스 맴버 적용
		//인스턴스화(객체화)
		ClassBasic c1 = new ClassBasic();
		//new 객체생성 -> 객체의 주소값이 생성
		//ClassBasic() -> construct(생성자)
		//c1 ->객체참조 변수 -> 객체라불리운다.
		//ClassBasic -> 사용자 정의 타입
		
		c1.userName="m1";
		c1.userPw ="1111";
		c1.age=20;
		c1.intstanceMethod();
		
		System.out.println("나이: "+c1.age);
		System.out.println("이름: "+c1.userName);
		System.out.println("비밀번호: "+c1.userPw);
	}
}
