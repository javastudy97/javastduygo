package org.study.basicPackage;

import java.util.Random;

public class RandomEx1 {
	
	public static void main(String[] args) {
		
		System.out.println("Random");
		
		Random r = new Random();
		//정수
		System.out.println(r.nextInt()); // 음수, 양수, 0
		System.out.println(r.nextInt(100)); // 0~99정수
		System.out.println(r.nextLong()); // long타입
		
		//실수
		System.out.println(r.nextFloat()); // 0->실수<1
		System.out.println(r.nextDouble());// 0->실수<1
		
		
		
	}
}
