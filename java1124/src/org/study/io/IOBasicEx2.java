package org.study.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOBasicEx2 {

	public static void main(String[] args) {

		System.out.println("IO");

		InputStreamReader inReader = new InputStreamReader(System.in);// 시스템으로 부터 입력
		//콘솔에서 입력을 받고 -1(ctrl+z)를 입력을 하면 종료
		while (true) {
			try {
				int inData = inReader.read();
				if (inData == -1)break; //-1은 ctrl+z치면 종료됨
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			inReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
