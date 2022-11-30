package org.study.packageEx;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.StringTokenizer;

public class BasicClass {
	
	
	public static void m1() {
		
	}
	
	public static void main(String[] args) {
		//java.lang 패키지에 있는 클래스
		Object o = null; // 자바의 최상위 클래스
		System s = null; // 표준 입출력(키보드,모니터) JVM종료
		Class c =null;// JDBC드라이버 찾기(클래스를 메모리로드)
		String str=null;//문자열저장(수정X)
		StringBuffer b = null;//문자열저장(수정 O)
		Math m =null;//Math
		Integer i = null;//Wrapper클래스(8가지)
		
		// java,util패키지(유용) ->  컬랙션 클래스
		String[] ab= {"root", "1111"};
		Arrays.asList(ab);// 배열을 조작(비교, 정렬, 찾기)
		Calendar c1 = null; // 운영체제 시간
		Date d = null; // 날짜와 시간
		StringTokenizer s2= null; //특정 문자열 기준으로 문자열 추출
		Random r =null; // 난수추출(0<=X <1)
		
		
	}
}
