package org.study.basicPackage;

import java.util.Date;
import java.util.Scanner;

public class DateEx2 {
	public static void main(String[] args) {
		System.out.println("Date");

		Date date = new Date();
		System.out.println(date);

		// 일요일0 월요일1, 화요일2, 수요일3
		// 목요일4, 금요일5, 토요일6, 나머지 요일선택오류
		// switch문이용해서 오늘 날짜 Date의 getDay()이용해서
		// 콘솔에 요일 출력해보세요
		
		Scanner input = new Scanner(System.in);
		int weekday = date.getDay();
		boolean run = true;	
		
		while(run){
			
			System.out.print("입력란(종료할꺼면 숫자 7누르기) : ");
			weekday = input.nextInt();
			
			switch (weekday) {

			case 0:
				System.out.println("일요일");
				break;
			case 1:
				System.out.println("월요일");
				break;
			case 2:
				System.out.println("화요일");
				break;
			case 3:
				System.out.println("수요일");
				break;
			case 4:
				System.out.println("목요일");
				break;
			case 5:
				System.out.println("금요일");
				break;
			case 6:
				System.out.println("토요일");
				break;
			case 7 :
				System.out.println("종료");
				run=false;
				break;
				
			default:
				System.out.println("요일선택오류!1");
				break;
				
			}
			
		}

	}
}
