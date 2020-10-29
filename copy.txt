package chap18.textbook.s180403;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String originalFileName = 
				"src/chap18/textbook/s180403/FileOutputStreamExample.java";
		String targetFileName = "copy.txt";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while ((readByteNo = fis.read(readBytes))!= -1 ) {	//readByteNo = 100
			System.out.println(readByteNo); 
			fos.write(readBytes, 0, readByteNo);
		}
		System.out.println(readByteNo);
		fos.flush(); //채운것을 다씀
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}
}
