package org.study.loopEx;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		
	
	// While(true)이용해서
			//계산기(+*/-)-> "exit"를 입력하면 while문을 종료
			// 정수 두숫자 입력, 연산자 입력(+-*/%) -> Scanner이용
			// 연산자에 따라 연산을 실행
			// -> 연산자가 "+" 숫자1+숫자2=두수의 합 -> 콘솔에 출력
			// if~else if, Scanner, 변수2개(정수), String(연산자) 1개
			// while(true) 사용
	
	Scanner input = new Scanner(System.in);
	
		while(true) {
			System.out.print("첫번째 수:");
			int num1 = input.nextInt();
	
			System.out.print("두번째 수:");
			int num2 = input.nextInt();
	
			System.out.print("연산자 입력(+-*/%)");
			String opr = input.next();
	
			String rt = num1+opr+num2+"=";
		
			if(opr.equals("+")){
				System.out.println(rt+(num1+num2));
			}else if(opr.equals("-")) {				
				System.out.println(rt+(num1-num2));
			}else if(opr.equals("*")) {
				System.out.println(rt+(num1*num2));
			}else if(opr.equals("/")) {
				System.out.println(rt+(num1/num2));
			}else if(opr.equals("%")) {
				System.out.println(rt+(num1%num2));
			}else if (opr.equals("exit")){
				
					System.out.print("종료됨");		
			}
		
		}
	
	}
}
 