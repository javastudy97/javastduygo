package org.java.variableEx;

import java.util.Scanner;

public class ScannerEx01 {
	
	public static void main(String[] args) {
		System.out.println("Scaneer");
		
		System.out.println("데이터를 입력 하세요:");
		
		Scanner scn =new Scanner(System.in);
		String str1=scn.nextLine();
		System.out.println("입력값: " +str1);
		
		System.out.print("나이 입력: ");
		int age=scn.nextInt();
		
		System.out.print("당신의 나이: " +age);
		
		scn.close();
		
	}
}
