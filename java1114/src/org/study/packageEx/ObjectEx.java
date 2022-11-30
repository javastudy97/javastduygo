package org.study.packageEx;
class ObSub{
	private String name;
	private int age;
	
	public ObSub() {	}
	
	public ObSub(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
}
public class ObjectEx {
	
	public static void main(String[] args) {
		ObSub o1 = new ObSub();
		ObSub o2 = new ObSub();
		
		System.out.println(o1.getClass()); //기본클래스의 전체
		System.out.println(o1.getClass().getName());//기본클래스 이름
		System.out.println(o1.getClass().isArray());//배열 is~ 냐? boolean
		System.out.println(o1.hashCode());
		System.out.println(o1.toString()); // o1의 정보 문자열
		System.out.println(o2.toString()); // o2의 정보 문자열
		
		//객체를 비교
		System.out.println(o1.equals(o2));
		
		
		
	}
}
