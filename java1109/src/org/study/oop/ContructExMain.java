package org.study.oop;

import java.util.Scanner;

public class ContructExMain {

	public static void main(String[] args) {

		ContructEx c1 =	new ContructEx();
		Scanner input = new Scanner(System.in);
		
		c1.setUserId("m0");
		c1.setUserPw("00");
		c1.setAge(11);
		
		System.out.println(c1.toString());
		c1.info();
		
		System.out.println("아이디: "+c1.getUserId());
		System.out.println("비밀번호: "+c1.getUserPw());
		System.out.println("나이: "+c1.getAge());
		
		ContructEx c2 =	new ContructEx("m1");
		ContructEx c3 =	new ContructEx("m2","11");
		ContructEx c4 =	new ContructEx("m3","33",33);
		c4.info();
		
	}
}
