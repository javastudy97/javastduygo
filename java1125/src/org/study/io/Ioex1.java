package org.study.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ioex1 {
	
	public static void main(String[] args) {
		
		String fileUrl="C:\\Users\\Administrator\\Desktop\\ioex2\\test3.txt";
//		1. file객체 생성 -> 2. 파일 경로 추가
		File file = new File(fileUrl);
		
		FileReader fReader=null;
		
		//3. 파일 가져오기(Reader -> 텍스트)
		try {
			fReader=new FileReader(file);
			//4.파일 텍스트를 읽는다.
			int inData=0;
			while((inData=fReader.read())!=-1) {
				//5. 콘솔 출력
				System.out.print((char)inData);
			}
			
		} catch (FileNotFoundException e) { //파일을 읽느냐?
			//파일 유무 확인
			System.out.println("파일 X");
			e.printStackTrace();
		} catch (IOException e) { //입출력이 가능하냐?
			//입출력 유무
			System.out.println("입출력 X");
			e.printStackTrace();
		}finally {
			try {
				fReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
