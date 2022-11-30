package org.study.operatorEx;

import java.util.Scanner;

public class Operator14 {
	public static void main(String[] args) {
		System.out.println("아스키코드");
		
		char c1='A';
		int c1_int='A';
//		System.out.println(c1+", "+c1_int);
//		System.out.println('a'+26);
//		System.out.println((char)('a'+25)); //문자형으로 바꾸고싶을때 (char)이용
//		
//		System.out.println('z');
//		System.out.println('A');		
//		System.out.println('Z');		
//		System.out.println('a'+'A');
//		System.out.println('z'+'Z');
//		
//		System.out.println("=대문자-> 소문자=");
//		System.out.println('A');				
//		System.out.println('A'+32);				
//		System.out.println((char)('A'+32));	//'A'+32 -> 97 -> (char)97 -> 'a' 대문자A를 소문자 a로 바꿔주기
//		
//		System.out.println("=소문자->대문자=");
//		System.out.println('a');
//		System.out.println('a'-32);
//		System.out.println((char)('a'-32));
		
//		String str1 = input.next();
//		String str2 = input.nextLine();
//		int i2=input.nextInt();
		
		System.out.println("대문자를 입력하세요(A~Z)");
		Scanner input=new Scanner(System.in);
		
        char ch=input.next().charAt(0);
//		int ch=input.next().charAt(0);
		
		System.out.println("ch-> "+ch);
		System.out.println("ch-> "+(ch+32));
		System.out.println("ch-> "+(char)(ch+32));
		
		input.close();
		
	}
			
	
		
	
}


