package org.study.loopEx;

import java.util.Scanner;

public class ForEx01 {
	
	public static void main(String[] args) {
		
		System.out.println("for문");
		
		for(int i=0;i<10;i++) {
			//0,1,2
			if(i<9) {
				System.out.print(i+",");
			}else {
				System.out.println(i);
			}
		}
		System.out.println();
		
		
		for(int i1=9;i1>=0;i1--) {
			if(i1==0) {
				System.out.println(i1);
				break;
			} 
				System.out.print(i1+",");
			
		}
		
		System.out.println();
		// Scaaner이용, 변수 2개
		// 첫번째숫자, 두번째 숫자를 입력 받아서
		// 첫번째숫자부터 두번째 숫자까지 콘솔에 출력
		// 조건이 첫번째 숫자<두번째 숫자
		Scanner number = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력:");
		int num1 = number.nextInt();
		
		System.out.print("두번째 숫자 입력:");
		int num2 = number.nextInt();
		
		
		if(num1<num2) {
			for(int i=num1;i<=num2;i++) {	
				if(i==num2-1) {
				System.out.print(i+" ");
				break;
				}
			System.out.print(i+" , ");
		  }
			
		}else {
			System.out.println("첫번째 입력숫자는 반드시 두번째 입력숫자보다 작아야됩니다.");
		}
	
   }
}
