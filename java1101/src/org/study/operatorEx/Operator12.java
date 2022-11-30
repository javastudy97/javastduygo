package org.study.operatorEx;

import java.util.Scanner;

public class Operator12 {
	public static void main(String[] args) {
		System.out.println("삼항연산자");
		
		int i =10;
		
		System.out.println(i++);//10
		System.out.println(i);//11
		i++;//12
		System.out.println(i);//
		System.out.println();
		
		System.out.println(++i);//13
		System.out.println(i);//13
		++i;//14
		System.out.println(i);//14
		
		System.out.println();
		
		int num = 10;
		
		System.out.println(num);//10
		System.out.println(num--);//10
		System.out.println(num);// 9
		num--;//8
		System.out.println(num);// 8
		System.out.println();
		
		System.out.println(num);// 8
		System.out.println(--num);// 7
		System.out.println(num);// 7
		--num;// 6
		System.out.println(num);// 6
		
		
		
	}
}


