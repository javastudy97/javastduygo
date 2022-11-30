package org.study.arrayEx;

public class Example03 {
		public static void main(String[] args) {
			
			System.out.println("다차원 배열");
			
			int sco [][]= {{100,95,90}, 
							 {97,95,90}, 
							 {91,75,88},
							 {81,85,70},
							 {77,50,65}};
			
			System.out.println("====기말고사 성적표====");
			System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
			System.out.println("===================");
			
			int korean=0;
			int english=0;
			int math=0;
			
			
			
			for(int line=0;line<sco.length;line++) {

				korean += sco[line][0];
				english += sco[line][1];
				math += sco[line][2];
				
						
				int sum=0;
				int avg=0;
				
				System.out.print(line+"\t");
				
				for(int train=0; train<sco[line].length; train++) {
					System.out.print(sco[line][train]+"\t");
					sum+=sco[line][train];
					
				}
				avg = (int)sum/(sco[line].length);
				
				System.out.print(sum+"\t");
				System.out.print((int)avg);
				
				System.out.println();
			}
			System.out.println("======================");
			System.out.print(korean+"\t"+english+"\t"+math);
			
			
		}
}
