package org.study.arrayEx;

public class ArrayEx02 {
	
	public static void main(String[] args) {
		System.out.println("배열");
		//int배열 arr1를 선언 하고 초기화 하였다.(배열의 주소가 저장되었다.)      
		
		int[] arr1 = new int[5];
		            // int형 data 5개를 저장할 수 있는 배열 생성
		System.out.println(arr1);
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		
		int[] arr2=new int[] {1,2,3,4,5};
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();
		
		int[] arr3= {1,2,3,4,5,6};
		for(int i:arr3) {
			System.out.print(i);
		}
		
		System.out.println();
		
		char[] arrCh= {'a','b','c','d','e'};
		for(int i=0; i<arrCh.length;i++) {
			System.out.print(arrCh[i]);
		}

		System.out.println();
		
		String[] strArr= {"JAVA", "JSP", "THYEMLEAF", "JAVASCRIPT", "HTML"};
		
		for(String str: strArr) {
			System.out.println(str);
		}
	}
}
