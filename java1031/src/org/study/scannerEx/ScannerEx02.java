package org.study.scannerEx;

import java.util.Scanner;

public class ScannerEx02 {
	public static void main(String[] args) {
		System.out.println("Scanner");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("첫번째 숫자(정수) 입력 :");
		int first=scn.nextInt();
		
		System.out.print("두번째 숫자(정수) 입력 :");
		int two=scn.nextInt();
		
		System.out.print(first+"+"+two+"="+(first+two));
	}
}
