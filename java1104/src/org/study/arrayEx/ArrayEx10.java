package org.study.arrayEx;

public class ArrayEx10 {
	public static void main(String[] args) {
		System.out.println("다차원 배열");
		
		//5행 3열
		int[][] score = {
							{100, 66, 77},
							{88, 66, 88},
							{80, 46, 97},
							{70, 88, 80},
							{100, 90, 88}
							};
		
		
		System.out.println("=====중간고사 성적표====");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("==================");
		
		int kor = 0;
		int math = 0;
		int eng = 0;
		
		for(int i=0; i<score.length; i++) {
			
			kor += score[i][0]; //국어
			math += score[i][1]; //수학
			eng += score[i][2]; //영어
			
			int sum=0;
			double avg=0.0;
			
			System.out.print(i+"\t");
			
			for(int j=0; j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				sum+=score[i][j];
			}
			avg=(int)sum/ score[i].length;
			
			System.out.print(sum+"\t");
			
			System.out.print(avg);
			
			System.out.println();
		}
		System.out.println("================");

		System.out.println("===================");
		System.out.println("과목별" + kor + " "+eng+" "+math);
		
	 }
	
}

		
//int kor = 0;
//int math = 0;
//int eng = 0;
//int sum = 0;
//double avg = 0.0;
//
//int scoreLength = score.length;
//System.out.println("배열의 행수: "+ scoreLength);
//
//System.out.println("중간고사 성적표");
//System.out.println("번호 국어 수학 영어 총점 평균");
//System.out.println("===============================");
//
//for (int i = 0; i< scoreLength; i++) {
//	System.out.print("   "+(i + 0)+ "    ");
//	
//	kor += score[i][0];
//	math += score[i][1];
//	eng += score[i][2];
//	
//		for(int j = 0; j < score[i].length; j++) {
//		   System.out.print(score[i][j]+" ");
//		   sum += score[i][j];
//		}
//		avg = (double) sum / scoreLength;
//		System.out.println(sum + " " + avg);
//	}
//
//	System.out.println("===================");
//	System.out.println("과목별" + kor + " "+math+" "+eng);
 