package org.study.condionEx;

import java.util.Scanner;

public class OppsQuiz1 {
  public static void main(String[] args) {
	
	  Scanner input = new Scanner(System.in);
	
	  System.out.print("연산자를 입력하세요(+-/*%)");
	  String operator = input.next();
	  
	  System.out.print("첫번째 수를 입력하세요:");
	  int num1 = input.nextInt(); 
	  
	  System.out.print("두번째 수를 입력하세요:");
	  int num2 = input.nextInt();
	  
	 String rs;
	  if(operator.equals("+")) {
		  System.out.println(num1+"+"+num2+"="+(num1+num2));
		 rs=num1+"+"+num2+"="+num1+num2;
	  }else if(operator.equals("-")){
		  System.out.println(num1+"-"+num2+"="+(num1-num2));
		  rs=num1+"-"+num2+"="+(num1-num2);
	  }else if(operator.equals("*")) {
		  System.out.println(num1+"*"+num2+"="+(num1*num2));
		  rs=num1+"*"+num2+"="+num1*num2;
	  }else if(operator.equals("/")){
		  System.out.println(num1+"/"+num2+"="+((double)num1/num2));
		  rs=num1+"/"+num2+"="+num1/num2;
	  }else if(operator.equals("%")){
		  System.out.println(num1+"%"+num2+"="+(num1%num2));
		  
	  }
	  
	  input.close();
  }
}
//산술계산
//+*/-
//
//1. int형 두수를 Scanner클래스에 입력해서 변수에 저장하고
//2. 산술연산자(+-/*%)을 Scanner 클래스를 이용하여 입력받아 (if)
//3. 연산에 따라 계산하여 결과값 콘솔에 표시하는 프로그램을 만들어 보세요
//4. 조건문(if~else if)
//5. 변수 입력값(2개) -> int num1, int num2
//6. 변수 연산자(+*/-)-> String op;
//7. 예 -> 콘솔에 -> "5+10=15"