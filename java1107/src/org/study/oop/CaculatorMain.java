package org.study.oop;

import java.util.Scanner;

public class CaculatorMain {
	public static void main(String[] args) {

		Caculator c1 = new Caculator();
		Scanner scn = new Scanner(System.in);
		// Caculator 생성한후에 필드 num1,num2,op를 초기화
		// op에 따라서 +/*-% -> if~else if이용해서
		// 매서드 sum(+), sub(-), muti(*), div(/), rem(%)
		// 호출 하는 프로그램을 작성하시오.
		// while문으로 반복해서 Exit치면 종료

		int i = 0;
		while (true) {
			System.out.print("계산기를 실행 하시겠습니까? "
					+ "종료를 원하면 Exit 나 exit 입력하시고, "
					+ "계속 실행을 원한다면 아무키나 누르세요");
			String str = scn.next();
			if (str.equals("Exit")||(str.equals("exit"))) {
				System.out.print("종료");
				break;
			} else {
				System.out.print("첫번째 숫자입력:");
				c1.num1 = scn.nextInt();
				System.out.print("두번째 숫자입력:");
				c1.num2 = scn.nextInt();
				System.out.print("연산자 입력:");
				c1.op = scn.next();

				if (c1.op.equals("+")) {
					c1.sum();
				} else if (c1.op.equals("-")) {
					c1.sub();
				} else if (c1.op.equals("*")) {
					c1.muti();
				} else if (c1.op.equals("/")) {
					c1.div();
				} else if (c1.op.equals("%")) {
					c1.rem();
				} else {
					System.out.println("연산자 입력오류");
				}
			}
			i++;
		}
		scn.close();
	}
}
