package org.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	
	public static void main(String[] args) {
		
		
		try {
			FileOutputStream fOut = new FileOutputStream("C:\\test2.out"); //이 파일로 저장해라
			FileInputStream fin = null;
			
			for(int i=0;i<10; i++) {
				int n=10-i;
				fOut.write(n);
			}
			if(fOut!=null) fOut.close();
			
//			fin=new FileInputStream("C:\\test1.txt");
			fin=new FileInputStream("C:\\test2.out");
			
			int inData=0;
			while((inData=fin.read()) !=-1) {
				System.out.print((char)inData); 
			}
			if(fin!=null) fin.close();
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
