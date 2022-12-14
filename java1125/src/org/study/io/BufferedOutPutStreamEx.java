package org.study.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class BufferedOutPutStreamEx {

	public static void main(String[] args) {
//		System.out.println("BufferedOutputSteram");
//		
//		Scanner input=new Scanner(System.in);
//		String userId=input.next();
//		
//		System.out.println(userId);
		FileOutputStream fos = null;
		String fileUrl = "C:\\Users\\Administrator\\Desktop\\ioex2\\123.txt";
		
		//123.txt -> 읽어서 -> 출력
		File file = new File(fileUrl); //파일 객체 생성 -> 파일 경로 추가
		FileReader fReader =null; //파일 Reader 생성 후 초기화
		try {
			fReader = new FileReader(file); // 파일 텍스트 읽기
			int inDate=0;
			while((inDate=fReader.read())!=-1) { //ctrl+z 입력 할 때 까지 문자 입력
				System.out.print((char)inDate);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		//버퍼 크기를 정해서 텍스트 파일안에 문자 삽입
		try {
			fos = new FileOutputStream(fileUrl);
			// BufferedOutputStream의 버퍼 크기를 5로 한다.
			BufferedOutputStream bos = new BufferedOutputStream(fos, 9); 
			//size가 다 모여야 출력이된다. 9나 10이상을 할경우 출력할려할 경우 버퍼에 파일이 꽉 차서 모이지 않았기 때문에 출력이 안되는것
			// 파일 123.txt에 1부터 9까지 출력한다.
			for (int i = '1'; i <= '9'; i++) {
				bos.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
