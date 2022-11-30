package org.study.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx5 {

	public static void main(String[] args) {

		System.out.println("Exception");
		
		int num1 = 10;
		int[] arrInt = new int[5];
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("숫자를 입력: ");
			int num2 = input.nextInt();
			
			System.out.println(num2);
			System.out.println(num1 / num2);// 0으로 나눔
			System.out.println(arrInt[5]);//배열 인덱스 초과
			System.out.println("OK");
			
		}catch (Exception e) { //모든 예외 처리
			e.printStackTrace();
		}finally {
			System.out.println("기본실행");
		}
		
		System.out.println("프로그램 정상 실행");

		
	}
}
