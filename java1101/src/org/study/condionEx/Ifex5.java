package org.study.condionEx;

import java.util.Scanner;

public class Ifex5 {
	public static void main(String[] args) {
		System.out.println("조건이 두개 일때--");
		//90점이상 A, 95점이상이면 A+
		Scanner input = new Scanner(System.in);
				
		System.out.println("국어 점수 입력: ");
		int kor = input.nextInt();
	
		// 90이상 A, 95이상이면 A+
		if(kor>=90) {
			//A 
			if(kor>=95) {
				System.out.println("A+");
			}else {
				System.out.println("A");
			}
		}else if(kor>=80)	{
			// 80이상 B, 85이상이면 B+
			//A 
			if(kor>=85) {
				System.out.println("B+");
			}else {
				System.out.println("B");
			}
		}
		
		// 70이상 C, 75이상이면 C+
		else if(kor>=70) {
			
			if(kor>=75) {
				System.out.println("C+");
			}else {
				System.out.println("C");
			}
		}
		// 60이상 D, 65이상이면 D+
		else if(kor>=60) {
			//A 
			if(kor>=65) {
				System.out.println("D+");
			}else {
				System.out.println("D");
			}
		}
		
		else{
			//60미만 F
			//A 
			System.out.println("F");
			
		}
		
		
		
		System.out.println("프로그램 종료합니다.");
		input.close();
		
	}
}
