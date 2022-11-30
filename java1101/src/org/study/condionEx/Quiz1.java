package org.study.condionEx;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("국어점수: ");
		int kor = input.nextInt();
		
		System.out.print("수학점수: ");
		int math = input.nextInt();
		
		System.out.print("영어점수: ");
		int eng = input.nextInt();
	
		int sum = kor+math+eng;
		
		int avg =sum/3;
		
		String jumsu = "";
		
		if(avg>=90) {
			jumsu="A";
		}
		else if(avg>=80) {
			jumsu="B";
		}
		else if(avg>=70) {
			jumsu="C";
		}
		else if(avg>=60) {
			jumsu="D";	
		}
		else{
			jumsu="F";
		}
		
		System.out.println("1.총점: "+sum);
		System.out.println("2.평균: "+avg);
		System.out.println("3.평균: "+jumsu);
        		
		System.out.println("프로그램이 종료되었습니다.");
		input.close();
	}
}

//Quiz_Condition
//학점 계산
//
//정수로 입력
//국어점수:  kor
//수학점수:  math
//영어점수:  eng
//총점: sum=kor+math+eng
//평균: avg=sum/3 (소수는 무시->모든 변수는 int)
//
//if~else if~else 이용해서
//평균>=90 "A"
//평균>=80 "B"
//평균>=70 "C"
//평균>=60 "D"
//평균<60 "F"
//
//콘솔에 출력
//1. 총점: 
//2. 평균:
//3. 학점: 