package org.study.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {

	public static void main(String[] args) {
		
		System.out.println("FileReader");
		
		String fileName="E:\\ioex\\test2.txt";
		File file1 = new File(fileName); // 파일을 불러온다.
		
		FileReader fReader = null;
		
		try {
			fReader =  new FileReader(file1);
			int inData=0;
			while((inData=fReader.read())!=-1) {
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
