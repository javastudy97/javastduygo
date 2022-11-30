package org.study.arrayEx;

public class Example04 {
	
	public static void main(String[] args) {
		System.out.println("배열");
	
	int[] random =new int[45];
	
	int temp;
	
		for(int i=0; i<6;i++) {
			int index =(int)(Math.random()*45);
			
		temp = random[index];
		random[index]=random[0];
		random[0]=temp;
		System.out.print(index+"\t");
		}
			
	}
}
