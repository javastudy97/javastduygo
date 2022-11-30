package org.study.operatorEx;

import java.util.Scanner;

public class Operator9 {
	public static void main(String[] args) {
		System.out.println("비트 연산자");
		
		System.out.println(1&1);
		System.out.println(1&0);
		System.out.println(0&1);
		System.out.println(0&0);
		System.out.println(10&12);
		System.out.println(10|12);
		System.out.println(Integer.toBinaryString(10&12));
		
//	int i1 = 10;
//	int i2 = 0b111;//2진수
//	int i3 = 0111;// 8진수
//	int i4 = 0xaaa;// 16진수
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫번째숫자 입력: ");
		int num1 = input.nextInt();
		
		System.out.println("두번째숫자 입력: ");
		int num2 = input.nextInt();
		
		System.out.println("수행할 연산자 입력: (&,|,^)");
		String op = input.next();
		
		if(op.equals("&")) {
			String binary = Integer.toBinaryString(num1&num2);
			System.out.println(num1 & num2);
			System.out.println(binary);
		}else if (op.equals("|")) {
			String binary = Integer.toBinaryString(num1|num2);
			System.out.println(num1 | num2);
			System.out.println(binary);
		}else if (op.equals("^")) {
			String binary = Integer.toBinaryString(num1^num2);
			System.out.println(num1 ^ num2);
			System.out.println(binary);
		}else {
			System.out.println("연산자 입력 오류 다시 입력해주세요.");
		}
		
		input.close();
	}
}


