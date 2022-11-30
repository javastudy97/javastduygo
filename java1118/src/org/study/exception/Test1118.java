package org.study.exception;

import java.time.LocalDate;

public class Test1118 {
	

	public static void main(String[] args) {
		
		
		int i=10; // 기본형
		
		//박싱
		Integer i2= new Integer(i); // (기본형 -> 객체형)
		
		i2.intValue();//기본형 (언박싱)
		
		int i3 = i2.intValue(); //기본형
		
		int j=10;
		//자동 박싱
		Integer j1=j;//기본 -> 객체
		//자동 언박싱
		int j2=j1;//객체형 -> 기본형
		
		Integer a0=new Integer(10);
		int a1=a0;// 자동언박싱
		int a2=new Integer(10);// 자동언박싱
		
		
		LocalDate targetDate = LocalDate.of(2024, 10, 5);  
		System.out.println(targetDate);//2024-10-05
		
		try {
		int[] arr = new int[5];
		arr[4] =10;
		arr[5] =10;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println();
		}
		
		System.out.println("정상");
	}
}
