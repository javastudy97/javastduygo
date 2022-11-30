package org.study.loopEx;

import java.util.Scanner;

public class WhileEx05 {
	public static void main(String[] args) {
		System.out.println("while(true)");
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자입력: ");
			int num1=input.nextInt();
			System.out.println("입력값: "+ num1);
			if(num1==0) 
				System.out.println("while문을 종료합니다.");
				break;
			
		}//break
		input.close();
		
	}
}
