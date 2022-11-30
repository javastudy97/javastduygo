package org.study.oop;

public class OverLoading1 {
	
	public static final String PROJECTNAME="JAVA";
	public int num1;
	public static int num2;
	
	public static void staticMehtod() {
//		num1=100;
		num2=200;
		System.out.println("staticMehtod");
	}
	
	public void nonStaticMehtod() {
		staticMehtod();
		num1=100;
		num2=200;
	}
	
	public void method1() {
		System.out.println("method1");
	}
	
	public void method1(int num1) {
		System.out.println(num1);
	}
	
	public void method1(int num1, String name) {
		System.out.println(num1);
		System.out.println(name);		
	}
//	public void method1(int num2, String name2) {
//		System.out.println(num1);
//		System.out.println(name);		
//	}
	public void method1(String name, int num1) {
		System.out.println(name);		
		System.out.println(num1);		
	}
}
