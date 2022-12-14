package org.study.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputR {
	public static void main(String[] args) {
		InputStreamReader reader = null;

		try {
			System.out.print("이름이 무엇입니까? ");
			reader = new InputStreamReader(System.in);

			BufferedReader in = new BufferedReader(reader);
			String name = in.readLine(); //외부 private용이나 웹에서 쓰는 일상용 스캐너는 테스트용

			System.out.println(name + "님" + "점수를 입력하세요");

			String[] stu = { "국어", "영어", "수학" };
			int[] ju = new int[3];
			

			double sum = 0.0;

			for (int i = 0; i < stu.length; i++) {
				System.out.print(stu[i] + ":");
				String juIn = in.readLine();
				ju[i] = Integer.parseInt(juIn);
				sum += ju[i];
			}
			System.out.println("국어: " + ju[0] + ", 영어: " + ju[1] + ", 수학: " + ju[2]);
			System.out.println("평균: " + sum / ju.length);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				//in은 대기 상태에서 처리되니까 close()로 안닫아도됨.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
