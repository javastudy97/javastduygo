package org.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FileReadEncoing {
	
	public static void main(String[] args) {
		System.out.println("encoding");
		
		FileInputStream fIn =null;
		InputStreamReader inReadder=null;
		String fileUrl="C:\\Users\\Administrator\\Desktop\\ioex2\\test4.txt";
		
			
		try {
			fIn=new FileInputStream(fileUrl);
//			inReadder= new InputStreamReader(fIn, "MS949"); //문자열 인코딩
			inReadder= new InputStreamReader(fIn, "UTF-8"); //문자열 인코딩
			
			int inData = 0;
			while((inData=inReadder.read())!=-1){
				System.out.println((char)inData);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fIn.close();
				inReadder.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
}
