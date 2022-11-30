package org.study.arrayEx;

public class ArrayEx09 {
	public static void main(String[] args) {
		System.out.println("다차원 배열");
		
		int[][] arrInt2 =new int[5][5];
		
		int num2=0;
		
		for(int i=0;i<arrInt2.length;i++) {
			for(int j=0;j<arrInt2[i].length;j++) {
				
				arrInt2[i][j]=num2*10+10;
				
				System.out.print(arrInt2[i][j]+"\t");
				num2++;
			}
			System.out.println();
		}
	}
}
