package org.study.collection;

public class GStackMain<T> {

	public static void main(String[] args) {

		GStack<Integer> gStack1 = new GStack<Integer>();

		int size = gStack1.oStack.length;
		// push매서드 10번 실행
		for (int i = 0; i < 10; i++) {
			// 10~100
			int i2 = i * 10 + 10;
			gStack1.push(i2);
			System.out.println(gStack1.oStack[i] + " ");
		}
		System.out.println("====================");
		// pop매서드를 이용해서 모든 oStack의 배열요소를 콘솔에 출력
//		for(int i=9; i>-1; i--) {
//		
//			gStack1.pop();
//			System.out.println(gStack1.oStack[i]+" ");
//			
//			
//		}
		for (int i = 0; i < size; i++) {
			System.out.print("gStack1.oStack[" + gStack1.idx + "]=");
			System.out.println(gStack1.pop());
		}

	}

}
