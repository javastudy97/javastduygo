package org.study.arrayEx;

public class ArrayEx08 {
	public static void main(String[] args) {
		System.out.println("다차원 배열");
		
		int[][] arr1 =new int[3][4];
		
		System.out.println(arr1.length);//행갯수
		System.out.println(arr1[0].length);//열갯수
//		System.out.println(arr1[0][0]);
//		System.out.println(arr1[0][1]);
//		System.out.println(arr1[0][2]);
//		System.out.println(arr1[0][3]);
		int num=0;
		
		for(int i=0;i<arr1.length;i++) {
//			System.out.println(arr1[i]);
				//	행->열갯수
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j]=++num;
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
