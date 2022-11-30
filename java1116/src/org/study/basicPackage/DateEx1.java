package org.study.basicPackage;

import java.util.Date;

public class DateEx1 {
	public static void main(String[] args) {
		System.out.println("Date");

		Date date = new Date();
		System.out.println(date);
		
		//밑줄친 의미는 권하지않는다. 근데 그래도 쓴다.
		System.out.println(date.getYear()+1900); //1900~122
		System.out.println(date.getMonth()+1); //0부터
		System.out.println(date.getDate()); //일
		System.out.println(date.getMonth()); //시
		System.out.println(date.getHours()); //분
		System.out.println(date.getMinutes()); //초
		System.out.println(date.getDay()); //요일 -> 일요일 0
		
		System.out.println((date.getYear()+1900)+"년 "+
							(date.getMonth()+1)+"월 "+
							date.getDate()+"일 "+
							date.getHours()+"시 "+
							date.getMinutes()+"분 "+
							date.getSeconds()+"초 "+
							date.getDay()+"요일");
		
		
	}
}
