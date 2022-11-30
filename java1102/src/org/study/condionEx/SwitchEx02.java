package org.study.condionEx;

import java.util.Scanner;

public class SwitchEx02 {
	public static void main(String[] args) {
		
		System.out.println("====switch====");
		Scanner input=new Scanner(System.in);
		
		System.out.print("알파벳 입력: ");
		String key = input.next();
		
		switch(key) {
		case "a":
		case "A":
			System.out.println("A");
			break;
		case "b":
		case "B":
			System.out.println("B");
			break;
		case "c":
		case "C":
			System.out.println("C");
			break;
		default:
			System.out.println("a,A,b,B,c,C 이외의 알파벳입니다.");
			
		}
		input.close();
	}
}
