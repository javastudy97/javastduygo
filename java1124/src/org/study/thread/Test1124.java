package org.study.thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test1124 {

	public static void main(String[] args) {

		Stack<Integer> stack1 = new Stack<Integer>();
		stack1.push(new Integer(10));
		stack1.push(20);// 자동 박싱
		stack1.push(30);// 자동 박싱
		stack1.push(40);// 자동 박싱
		stack1.push(50);// 자동 박싱

		System.out.println(stack1);
		stack1.pop(); // 마지막 데이터를 꺼내고 지운다.
		System.out.println(stack1);
		stack1.pop();
		System.out.println(stack1);
		stack1.pop();
		System.out.println(stack1);
		System.out.println("============");

		Queue<Integer> qu = new LinkedList<Integer>();

		for (int i = 0; i < 5; i++) {
			qu.add(i * 10 + 10);
		}
		System.out.println(qu);
		System.out.println(qu.peek());

		// 2*1=1~ 9*9=81

//		int index=2;
//		while(index<10){
//				System.out.println(index+"단입니다.");
//				 int j=1;
//				 while(j<10){
//				  System.out.println(index+"*"+j+"="+(index*j));
//				   j++;
//				  }
//				 index++;
//			}

		System.out.println("===========");

		int i = 2;
		
		boolean bool = false;
		while (true) {
			System.out.println(i + "단");
			
			int j=1;
			while(true) {
				System.out.println(i+"*"+j+"="+(i*j));
				
				if(j>=9) break;
				
				j++;
			}
			
			if(i>=9) break;
			
			i++;
		}
		
		for(int i2=2; i2<10; i2++)
		 {   System.out.println(i2+"단입니다.");
		       for( int j2 =1; j2<10; j2++){
		        System.out.println(i2+"*"+j2+"="+(i2*j2));
		       }
		}
		
		
		
		
		System.out.println("프로그램 종료");
	}
}
