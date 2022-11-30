package org.study.basicPackage;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokennizerEx2 {
	
	public static void main(String[] args) {
//		String url = "userId=m111&userPw=1111&userName=s1111"; //&을 이용해서 문자단위를 설정
//		//에러날 시 구분기호를 실수했구나 꼭 확인 
//		StringTokenizer token = new StringTokenizer(url, "&");
//		System.out.println("토큰의 갯수: "+ token.countTokens());
//		//토큰이 있으면
//		while (token.hasMoreTokens()) {
//			String ntoken = token.nextToken();
//			System.out.println(ntoken);
//		}
//		System.out.println("---------------------------");
//		// StringTokenizer이용해서 - 구분기호를 콘솔에 출력
//		String phone = "010-1234-5678";
//		StringTokenizer token2 = new StringTokenizer(phone, "-");
//		
//		System.out.println("토큰의 갯수:" + token2.countTokens());
//		while (token2.hasMoreTokens()) {
//			String ntoken = token2.nextToken();
//			System.out.println(ntoken);
//		}
		
		// String타입의 변수 userId, userPw, userName에
		// Scanner클래스를 이용해 초기화 시키고
		// concat(); 문자열 합치는 매서드를 이용해
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("아이디입력");
		String userId = scn.next();
		String userId2 = "userId=" .concat(userId);
		System.out.println(userId2);
		
		System.out.println("비밀번호입력");
		String userPw = scn.next();
		String userPw2 = "userPw=" .concat(userPw);
		System.out.println(userPw2);
		
		System.out.println("이름입력");
		String userName = scn.next();
		String userName2 = "userName=" .concat(userName);
		System.out.println(userName2);
		
		System.out.println("==========");
		
//		String integration = userId2+"&"+userPw2+"&"+userName2;
		String s1 = userId2.concat("&");
		String s2 = userPw2.concat("&");
		String s3 = s1.concat(s2);
		String integration = s3.concat(userName2);
		
		System.out.println(integration);
		
		StringTokenizer token3 = new StringTokenizer(integration, "&");
		System.out.println("토큰의 갯수: "+ token3.countTokens());
				
		
	}
}
