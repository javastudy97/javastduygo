package org.study.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx2 {

	public static void main(String[] args) {
		
		System.out.println("FileReader");
		
//		String fileName="E:\\ioex\\test2.txt"
		
		FileReader fReader = null;
		
		try {
			fReader =  new FileReader("E:\\ioex\\test2.txt");
			int inData=0;
			
			while((inData=fReader.read())!=-1) { // -1은 문자의 끝을 의미
				System.out.print((char)inData);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 X");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO X");
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
