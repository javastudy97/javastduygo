package org.study.arrayEx;

public class ArrayEx03 {
	
	public static void main(String[] args) {
		System.out.println("배열");
		// 로또 0번지~44번지 -> 1~45 배열
		//1. 배열 선언
		int[] lotto=new int[45];
		
		System.out.println(lotto.length);
		// 2.초기화 1~45
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1;
			System.out.print(lotto[i]+",");
		}
		
		
//		System.out.println(Math.random());
//		System.out.println(Math.random()*10);
	
		
		int temp;
		
		for(int i=0;i<10;i++) {
//			System.out.println((int)(Math.random()*46));
			//random 인덱스 -> (0~44번지)
			int idx=(int)(Math.random()*45);
			
			temp=lotto[idx]; //random -> temp
			lotto[idx]=lotto[0]; //0번지 -> random
			lotto[0]=temp;//temp -> 0번지
			
		}
		
		for(int i=0; i<6; i++) {
			if(i==5) {
				System.out.println(lotto[i]);
				break;
			}
		
			System.out.println(lotto[i]+",");
		}
	}
}
