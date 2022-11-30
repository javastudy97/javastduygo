package org.study.oop;

import java.util.Scanner;

public class ConstructExMain {

	public static void main(String[] args) {
		
//		ConstructEx c1 = new ConstructEx(); //다른 생성자를 생성할 시 에는 기본생성자를 꼭 생성해야함
//		ConstructEx c2 = new ConstructEx(10, 20);
		
		//Scanner이용해서
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("계산기");
		
		System.out.print("첫번째숫자입력: ");
		int n1=input.nextInt();
		
		System.out.print("두번째숫자입력: ");
		int n2=input.nextInt();

		System.out.print("연산자입력: ");
		String op2 = input.next();
		
		ConstructEx c3 = new ConstructEx(n1, n2, op2);
		
		int num1 = c3.getNum1();
	
		int num2 = c3.getNum2();
		
		String op=c3.getOp();
	
		
		if(op.equals("+")) {
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}else if(op.equals("-")) {
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}else if(op.equals("*")) {
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		}else if(op.equals("/")) {
			System.out.println(num1+"/"+num2+"="+((double)num1/num2));
		}else if(op.equals("%")) {
			System.out.println(num1+"%"+num2+"="+(num1%num2));			
		}else {
			System.out.println("연산자 입력 오류");						
		}
		
		
//		System.out.println(c3.getNum1());
//		System.out.println(c3.getNum2());
//		System.out.println(c3.getOp());
		
		
	}
	
}
