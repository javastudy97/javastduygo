package org.study.arrayEx;

public class ArrayEx05 {
	public static void main(String[] args) {
		System.out.println("배열");
		//숫자 1~10까지 배열 저장하고
		//임의 인덱스를 for문을 이용 100번정도 자리바꿈을 수행한다.
		//배열의 첫번째인덱스 부터 다벗번째 인덱스까지 콘솔 출력 해보세요
		
		//1.배열생성
		
		char[] c1=new char[5];
		char[] c2=new char[] {'a','b','c','d','e'};
		char[] ch = { 'a', 'b', 'c', 'd', 'e'};
		for (int i = 0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println("----------------------------");
		for (char idx : ch) { // 객체형 반복문
			System.out.println(idx);
		}
		System.out.println("----------------------------");
				
		int[] arrlnt = new int[45];
		for(int i : arrlnt) {
			System.out.println(i);
		}
		System.out.println("----------------------------");
		
		System.out.println("char형 배열 >>String");
		
	
		
		
	}
}
