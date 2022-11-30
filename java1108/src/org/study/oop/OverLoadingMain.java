package org.study.oop;

public class OverLoadingMain {
	
	static int num1;
	
	public static void main(String[] args) {
		
		num1=100;
		
		
		OverLoading1 over1 = new OverLoading1();
		
		
		over1.nonStaticMehtod();
		
		over1.method1();
		over1.method1(100);
		over1.method1(100, "OverLoading1");
		over1.method1("OverLoading2",100);
		
		System.out.println();
		System.out.println(true);
		System.out.println('c');
		System.out.println(new char[] {'c','a','f','e'});
		System.out.println(1.15);
		System.out.println(1.15f);
		System.out.println(10);
		System.out.println(10L);
		System.out.println(new OverLoading1());
		System.out.println(new String("String"));
		System.out.println("String2");
		
	}
}
