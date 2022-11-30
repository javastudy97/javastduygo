package org.study.oop;

public class MethodBasicMain {
	
	public static String userId;
	
	public static final String PROJECT="PROJECT2022";
	
	public static void main(String[] args) {

		userId="m111";// static 매서드는 static 필드를 사용
		
		MethodBasic.classMethod1();
		
		MethodBasic method1 = new MethodBasic();

		method1.method1();
		int sum = method1.method2();
		System.out.println(method1.method2());
		System.out.println(sum);

		method1.method3(100, 200);
		method1.method3(500, 200);

		int sum2 = method1.method4(300, 200);
		System.out.println(sum2);
	}
}
