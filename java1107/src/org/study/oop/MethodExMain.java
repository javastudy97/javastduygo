package org.study.oop;

public class MethodExMain {
	 public static void main(String[] args) {
		 
		MethodEx m1=new MethodEx();
		m1.method1();
		
		System.out.println(m1.method2());
		int num1 = m1.method2();
		System.out.println(num1);
		
		System.out.println(m1.method3());
		String str1=m1.method3();
		System.out.println(str1);
		
		m1.mehtod4(20, 30);
		m1.mehtod4(200, 300);
		
		int sum=m1.mehtod5(15, 20);
		System.out.println(sum);
		
		m1.mehtod5(10, 20, "+");
		m1.mehtod5(10, 20, "-");
		m1.mehtod5(10, 20, "*");
		m1.mehtod5(10, 20, "/");
		m1.mehtod5(10, 20, "%");
		m1.mehtod5(10, 20, "^^");
	}
}
