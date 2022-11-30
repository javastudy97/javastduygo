package org.study.basicPackage;

import java.util.StringTokenizer;

public class StringTokennizerEx1 {
	
	public static void main(String[] args) {
		String url = "userId=m111&userPw=1111&userName=s1111"; //&을 이용해서 문자단위를 설정
		//에러날 시 구분기호를 실수했구나 꼭 확인 
		StringTokenizer token = new StringTokenizer(url, "&");
		System.out.println("토큰의 갯수: "+ token.countTokens());
		//토큰이 있으면
		while (token.hasMoreTokens()) {
			String ntoken = token.nextToken();
			System.out.println(ntoken);
		}
		System.out.println("---------------------------");
		// StringTokenizer이용해서 - 구분기호를 콘솔에 출력
		String phone = "010-1234-5678";
		StringTokenizer token2 = new StringTokenizer(phone, "-");
		
		System.out.println("토큰의 갯수:" + token2.countTokens());
		while (token2.hasMoreTokens()) {
			String ntoken = token2.nextToken();
			System.out.println(ntoken);
		}
	}
}
