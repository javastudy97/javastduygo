package org.study.loopEx;

import java.util.Scanner;

public class WhileEx07 {
	public static void main(String[] args) {
		System.out.println("while(true)");
		// While(true)이용해서
		//계산기(+*/-)-> "exit"를 입력하면 while문을 종료
		// 정수 두숫자 입력, 연산자 입력(+-*/) -> Scanner이용
		// 연산자에 따라 연산을 실행
		// -> 연산자가 "+" 숫자1+숫자2=두수의 합 -> 콘솔에 출력
		// if~else if, Scanner, 변수2개(정수), String(연산자) 1개
		// while(true) 사용
		
		Scanner input=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("계산기를 실행 하겠습니까?");
			String result=input.next();
			
			if(result.equals("exit")) {
				System.out.println("종료합니다.");
			    break;
			}else if(result.equals("run")) {
				
				System.out.print("연산자 입력: ");
				String operater = input.next();
			
				System.out.print("첫번째수: ");
				int num1 = input.nextInt();
			
				System.out.print("두번째수: ");
				int num2 = input.nextInt();
				
				if(operater.equals("+")) {
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				}
				else if(operater.equals("-")){
				System.out.println(num1+"-"+num2+"="+(num1-num2));
				
				}else if(operater.equals("*")){
				System.out.println(num1+"*"+num2+"="+(num1*num2));
			
				}else if(operater.equals("/")){
				System.out.println(num1+"/"+num2+"="+(num1/(double)num2));
				
				}else if(operater.equals("%")) {
				System.out.println(num1+"%"+num2+"="+(num1%num2));
				}else {
				System.out.println("입력오류! 다시입력");
				}	
			}
		}
	

		input.close();
		}
	
		
}

