package org.study.oop;

public class MethodBasic {

	public String userId;
	
		public void method0() {
			userId="m1111";
			System.out.println("id: "+userId);
		}
	// 매서드
	// 인스턴스 매서드
		public void method1() {
		System.out.println("반환X, 매개X, method1");
		}

		public int method2() {
		System.out.println("반환O, 매개X, method2");
		int num1 = 10;
		int num2 = 20;

		return num1 + num2;
		}

		public void method3(int num1, int num2) {
		System.out.println("반환X, 매개O, method3");
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
//		return;
		}

		public int method4(int num1, int num2) {
		System.out.println("반환O, 매개O, method4");
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		return num1 + num2;
		}
	//클래스 매서드	
		public static void classMethod1() {
//			userId = "m222"; static 필드가 아니라서 사용불가
//			int i=10;
			System.out.println("클래스 매서드");
		}
		
}


