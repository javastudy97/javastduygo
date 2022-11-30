package org.study.loopEx;

import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {

		System.out.println("for문");
		// Scanner이용해서, 시작단,끝단 -> 2단, 5단 2~5
		// 시작단, 끝단을 입력을 받아서 콘솔에 출력 하시오.
		// 단 . 시작단은 끝단보다 작다.
		// for으로 구현해보세요
		Scanner gugu = new Scanner(System.in);

		System.out.print("시작단 :");
		int start = gugu.nextInt();

		System.out.print("끝단:");
		int end = gugu.nextInt();

		if (start < end) {
			for (int i = start; i <= end; i++) {
				System.out.println(i + "단입니다.");
				for (int j = 1; j < 10; j++) {
					// 2*1=2
					System.out.println(i + "*" + j + "=" + (i * j));
				}

			}
		} else
			System.out.println("시작단이 끝단보다 작아야합니다. 다시입력해 주세요.~");
		gugu.close();
	}
}
