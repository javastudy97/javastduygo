package org.study.operatorEx;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		System.out.println("계산기");
		Scanner scn = new Scanner(System.in);
		
		
		
		System.out.print("첫번째 수: ");
		int num1 =scn.nextInt();
		
		System.out.print("두번째 수: ");
		int num2 =scn.nextInt();
		
		System.out.print("연산자:");
		String str1 = scn.next();
		
		if(str1.equals("+"))
		{
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}
		
		if(str1.equals("-"))
		{
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}
		
		if(str1.equals("*"))
		{
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		}
		
		if(str1.equals("/"))
		{
			System.out.println(num1+"/"+num2+"="+(num1/num2));
		}
		
		if(str1.equals("%"))
		{
			System.out.println(num1+"%"+num2+"="+(num1%num2));
		}
		
		scn.close();
		
	}	
}


/*System.out.println(num1+"+"+num2+"="+(num1+num2));//10+20=30
System.out.println(num1+"-"+num2+"="+(num1-num2));//10-20=-10
System.out.println(num1+"*"+num2+"="+(num1*num2));//10*20=200
System.out.println(num1+"/"+num2+"="+(num1/(double)num2));//10/20=0.5
System.out.println(num1+"%"+num2+"="+(num1%num2));*/
//문 Scanner를 이용하여, 두정수 (int num1, int num2)와
//연산자(+-*/%) 중 하나 를 입력 받아서
//연산자가 "+"면 num1+num2,
//연산자가 "-"면 num1-num2,
//연산자가 "*"면 num1*num2,
//연산자가 "/"면 num1/num2,
//연산자가 "%"면 num1%num2를 콘솔에 출력 하시오.
//예) 연산자가 "+", num1=10, num2=20 -> 10+20 콘솔에 출력