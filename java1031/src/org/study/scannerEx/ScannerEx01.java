package org.study.scannerEx;

import java.util.Scanner;
//import java.util.*; //util(유틸리티)의 모든클래스를 가져와준다

public class ScannerEx01 {

	public static void main(String[] args) {
		
		System.out.println("Scanner");
		//프로그래머가 입력
		Scanner scn=new Scanner(System.in);
		//주소를 입력 "서울시 노원구"
		System.out.print("주소를 입력하세요-> ");
		String addr=scn.nextLine();//입력 문자열을 return;
		System.out.println("주소: " +addr);
		
		System.out.print("이름을 입력하세요. ->");
		String name=scn.next();// 공백x
		System.out.println("이름: " +name);
		
		System.out.print("나이를 입력하세요. ->");
		int age=scn.nextInt();
		System.out.println("나이: " +age);
				
		System.out.println("키를 입력 하세요. ->");
		double hei = scn.nextDouble();
		System.out.println("키: " +hei);
	}
}
