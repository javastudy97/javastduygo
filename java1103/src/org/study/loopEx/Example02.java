package org.study.loopEx;

import java.util.Scanner;

public class Example02 {

	// 시작단, 끝단 입력 받아서 시작부터~끝단까지 구구단을 콘솔에 출력
	// 단, do~while문으로 작성
	public static void main(String[] args) {
//	
//	Scanner input = new Scanner(System.in);
//	
//	System.out.print("시작단:");
//	int start = input.nextInt();
//		
//	System.out.print("끝단:");
//	int end = input.nextInt();
//	
//	int	i=start;
//	if(i<end) {
//	
//		do{
//			
//			System.out.println(i+"단입니다.");
//			int j=1;
//			do {
//				j++;
//				System.out.println(i+"*"+j+"="+(i*j));				
//				
//			}while(j<10);
//			
//			i++;
//		}while(i<=end);
		
		
		int i=2;	
		do {
			i++;
			System.out.println(i+"단입니다.");
			int j=1;
			do {
				j++;
				System.out.println(i+"*"+j+"="+(i*j));
			
			}while(j<10);
		
		}while(i<8);
	
//		int i=0;
//		while(true){
//		      if(i>10) {
//		    	  break;
//		      }else {
//			       System.out.print(i);
//				      i++;
//		      }
//		      
//
//		}
//		int[] arr1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
////		for(int i=1; i<arr1.length+1; i++)
////		{
////		System.out.print(i+" ");
////
////		}
//		
//		for(int i: arr1) {
//			System.out.println(i); //객체형 반복문
//		}
		
	}
  }

 