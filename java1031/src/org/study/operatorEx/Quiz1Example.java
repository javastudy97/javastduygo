package org.study.operatorEx;

import java.util.Scanner;

public class Quiz1Example {
	public static void main(String[] args) {
		
//		Scanner를 이용해서 정수를 입력받아서 홀짝프로그램을 수행 하시오.
		//Scanner, if문, 산술연산자
		//출력값이 "짝수입니다", "홀수입니다" 으로 출력해보세요 
		System.out.println("정수를 입력받으시오");
		System.out.print("정수 :");
		
		Scanner scn = new Scanner(System.in);
		int number =scn.nextInt();
		
		if(number%2==0){
				System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
			
		}
		
		scn.close();
	}
}

