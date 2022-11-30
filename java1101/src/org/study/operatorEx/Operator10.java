package org.study.operatorEx;

import java.util.Scanner;

public class Operator10 {
	public static void main(String[] args) {
		System.out.println("쉬프트연산자");
		int i =15;
		
		System.out.println("오른쪽 shift연산자");
		System.out.println("15-> " +Integer.toBinaryString(i));
		System.out.println("15>>2 " +Integer.toBinaryString(i>>2));
		System.out.println("10진수 결과: "+(i>>2));
		System.out.println("2진수 결과:" +Integer.toBinaryString(i>>2));

		System.out.println("왼쪽 shift연산자");
		System.out.println("15-> " +Integer.toBinaryString(i));
		System.out.println("15<<2 " +Integer.toBinaryString(i<<2));
		System.out.println("10진수 결과: "+(i<<2));
		System.out.println("2진수 결과:" +Integer.toBinaryString(i<<2));
		
		
//	int i1 = 10;
//	int i2 = 0b111;//2진수
//	int i3 = 0111;// 8진수
//	int i4 = 0xaaa;// 16진수
		
		
	}
}


