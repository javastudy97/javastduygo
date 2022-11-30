package org.study.loopEx;

import java.util.Scanner;

public class DoWhileEx02 {
	
	public static void main(String[] args) {
		System.out.println("do~while");
		System.out.println("구구단");
//		int i=1;
//		
//		do {
//		
//			i++;
//			System.out.println(i+"단입니다.");
//		
//			int j=0;
//			do {
//				j++;
//				System.out.println(i+"*"+j+"="+(i*j));
//				
//			}while(j<9);
//			// 증감식
//			
//		}while(i<9);//2.조건식
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("시작단:");
		int start = input.nextInt();
		
		System.out.println("끝단:");
		int end = input.nextInt();
		
		int i= start;
		if(i<end) {
		
			do {	
				
				System.out.println(i+"단입니다.");
				
				int j=1;
				do {
					System.out.println(i+"*"+j+"="+(i*j));
					j++;
				}while(j<10);
				
				i++;
			}while(i<=end) ;
		
		}
		else {
			System.out.println("시작단이 끝단보다 큽니다.");
			
		}
		input.close();
		
	}
}
