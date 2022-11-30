package org.study.arrayEx;

public class Text1104 {
		
		public static void main(String[] args) {
			
			
			int i=0;
			while(true){
			      if(i==10) {
			    	  break;
			      }else {
				i++;
			       System.out.print(i);
			      }
			}
			System.out.println();
			
			int[] arr1= new int[10];
			
			for(int s=0; s<10; s++) {
				arr1[s]=s+1;
				System.out.print(arr1[s]);
			}
		}
}
