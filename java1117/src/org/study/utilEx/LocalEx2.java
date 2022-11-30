package org.study.utilEx;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalEx2 {

	public static void main(String[] args) {

		// 날짜를 비교할 수 있다.
		LocalDateTime startDateTime = LocalDateTime.now();// 오늘
		LocalDateTime endDateTime = LocalDateTime.of(2023, 8, 1, 23, 59, 59);
		System.out.println("기준날짜: " + startDateTime);
		System.out.println("비교날짜: " + endDateTime);

		// 이전 날짜냐?
		boolean bool = startDateTime.isBefore(endDateTime); // true
		System.out.println(bool);
		// 같은 날짜냐?
		bool = startDateTime.isEqual(endDateTime); // false
		System.out.println(bool);
		// 이후 날짜냐?
		bool = startDateTime.isAfter(endDateTime); // false
		System.out.println(bool);
		if (startDateTime.isAfter(endDateTime)) {
			System.out.println("선택날짜 이후입니다.");
		} else {
			System.out.println("선택날짜 이후가 아님입니다.");
		}

		//////////////////////////////////

		ZonedDateTime utcZone = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utcZone);
		
		ZonedDateTime seoulZone	= ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulZone);
		
		
		
	}
}
