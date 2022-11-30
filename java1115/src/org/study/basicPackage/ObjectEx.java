package org.study.basicPackage;

class Obj1{
	int num1;
	
}

public class ObjectEx {
	
	public static void main(String[] args) {
		Obj1 ob1 = new Obj1();
		Obj1 ob2 = new Obj1();
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode()); //해쉬코드
		System.out.println(ob1.getClass());
		System.out.println(ob2.getClass()); //객체 클래스 위치명
		System.out.println(ob1.getClass().getName()); 
		System.out.println(ob2.getClass().getName()); //객체 패키지
		
		System.out.println((ob1.toString())); //객체의 정보 toString
		System.out.println((ob2.toString()));
	}
}
