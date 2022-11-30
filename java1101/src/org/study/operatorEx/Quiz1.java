package org.study.operatorEx;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		//대문자를 입력 받아서 소문자로 변경 콘솔에 출력
		//소문자를 입력 받아서 대문자로 변경 콘솔에 출력
		//Scanner, .next()/charAt(0)
		Scanner input = new Scanner(System.in);
		
		System.out.print("대문자를 입력하세요.(A~Z)");
		char ch1 = input.next().charAt(0);
		System.out.println("ch1-> "+(char)(ch1+32));
		
		System.out.println("-------------------");
		
		System.out.print("소문자를 입력하세요.(a~z)");
		char ch2 = input.next().charAt(0);
		System.out.println("ch2-> "+(char)(ch2-32));
		
		input.close();
		
	}
}
