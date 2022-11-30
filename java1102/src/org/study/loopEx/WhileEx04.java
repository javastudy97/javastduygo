package org.study.loopEx;

import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {
		System.out.println("while");
		// Scanner이용해서, 시작단,끝단 -> 2단, 5단 2~5
		// 시작단, 끝단을 입력을 받아서 콘솔에 출력 하시오.
		// 단 . 시작단은 끝단보다 작다.
		// while으로 구현해보세요
	   
		Scanner gugu =new Scanner(System.in);
 

	System.out.print("시작단은 몇단인가? ");
	int start = gugu.nextInt();
    
	System.out.print("끝단은 몇단인가? ");
		int end = gugu.nextInt();	
		
	int i= start;
	
	if(i<end) {
			while(i<end+1) {
				System.out.println(i+"단입니다.");
			int j=1;
				while(j<10) {
				System.out.println(i+"*"+j+"="+(i*j));
					j++;
			}
			
			 i++;	
		}
		}else System.out.println("시작단이 끝단보다 큽니다.");
		

		
		   }
			
	}					
			
	

