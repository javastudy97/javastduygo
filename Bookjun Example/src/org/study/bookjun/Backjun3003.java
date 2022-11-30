package org.study.bookjun;

import java.util.Scanner;

public class Backjun3003 {
	public static void main(String[] args) {
	
		
		
		Scanner chees = new Scanner(System.in);
		//정해져 있는 체스 말의 개수
		int king = 1; 
		int queen= 1; 
		int bishop= 2;
		int look= 2;
		int knight= 2;
		int phone= 8;
	//chees.nextInt() 현재 있는 체스 말의 개수
		//즉 정해져있는 말의 개수에서 현재있는 말의 개수를 빼서 찾아야하는 체스말을 찾아야한다.
		king= king - chees.nextInt(); 
		queen= queen - chees.nextInt();
		bishop= bishop- chees.nextInt();
		look= look- chees.nextInt();
		knight= knight- chees.nextInt();
		phone= phone - chees.nextInt();
		
		
		System.out.print(king + " ");
		System.out.print(queen + " ");
		System.out.print(bishop + " ");
		System.out.print(look + " ");
		System.out.print(knight + " ");
		System.out.print(phone + " ");
	
		
		chees.close();

        
	}
}
