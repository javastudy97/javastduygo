package org.study.operatorEx;

import java.util.Scanner;

public class Quiz2Example {
	public static void main(String[] args) {
		
		
		System.out.println("계산기 프로그램");
	    Scanner scn=new Scanner(System.in);
	    
	    System.out.print("첫번째 숫자:");
	    int number1 =scn.nextInt();
	    
	    System.out.print("두번째 숫자:");
	    int number2 =scn.nextInt();
	    
	    System.out.print("연산자: ");
	    String operation =scn.next();
	    
	    if(operation.equals("+")) {
	    	System.out.println(number1+"+"+number2+"="+(number1+number2));
	    }
	    if(operation.equals("-")) {
	    	System.out.println(number1+"-"+number2+"="+(number1-number2));
	    }
	    if(operation.equals("*")) {
	    	System.out.println(number1+"*"+number2+"="+(number1*number2));
	    }
	    if(operation.equals("/")) {
	    	System.out.println(number1+"/"+number2+"="+(number1/number2));
	    }
	    if(operation.equals("%")) {
	    	System.out.println(number1+"%"+number2+"="+(number1%number2));
	    }
	    
		scn.close();
	}	
}


//문 Scanner를 이용하여, 두정수 (int num1, int num2)와
//연산자(+-*/%) 중 하나 를 입력 받아서
//연산자가 "+"면 num1+num2,
//연산자가 "-"면 num1-num2,
//연산자가 "*"면 num1*num2,
//연산자가 "/"면 num1/num2,
//연산자가 "%"면 num1%num2를 콘솔에 출력 하시오.
//예) 연산자가 "+", num1=10, num2=20 -> 10+20 콘솔에 출력