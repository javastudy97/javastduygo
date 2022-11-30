package org.study.operatorEx;

import java.util.Scanner;

public class Operator1 {

	public static void main(String[] args) {
		System.out.println("산술연산자");
		
    	Scanner scn= new Scanner(System.in);
		System.out.println("두숫자(정수)를 입력받아서 산술연산을 하시오");
		
		System.out.print("첫번째숫자:");
		int num1 = scn.nextInt();
		
		System.out.print("두번째숫자:");
		int num2 = scn.nextInt();
		
		
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));//10+20=30
		System.out.println(num1+"-"+num2+"="+(num1-num2));//10-20=-10
		System.out.println(num1+"*"+num2+"="+(num1*num2));//10*20=200
		System.out.println(num1+"/"+num2+"="+(num1/(double)num2));//10/20=0.5
		System.out.println(num1+"%"+num2+"="+(num1%num2));//10%20=10
		
		
	}
}
