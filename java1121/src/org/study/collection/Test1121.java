package org.study.collection;

abstract class  B{
	   int num;
	    void b2(){   }
	    abstract  void b1();
	}
	class B2 extends B{

		@Override
		void b1() {
			System.out.println("추상매서드 오버라이딩");
		}
		
	}
public class Test1121 {

	public static void main(String[] args) {
		
		int[] arr= new int[5];
		
		try {
			arr[5] = 10;
			System.out.println("예외발생 X");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생 O");
			e.printStackTrace();
		}finally {
			System.out.println("기본실행");
		}
		
		System.out.println("정상실행");
	}
	
}
