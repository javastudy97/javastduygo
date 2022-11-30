package org.study.basicPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx1 {
	
	public static void main(String[] args) {
		
		System.out.println("DateFormat");
		
		//1.날짜
		Date date = new Date();
		
		//2.날짜 포멧
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		//3.날짜를 문자열로 포멧
		String day1 = format.format(date); //날짜가아니라 문자열로
		System.out.println(day1);
		
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
		
		String day2=format2.format(date);
		System.out.println(day2);
		
		Date day3 = new Date(2022-1900,10,16,16,30,12);
		//월은 0~11
		System.out.println(day3);
		System.out.println(format.format(day3));
		System.out.println(format2.format(day3));
	}
}
