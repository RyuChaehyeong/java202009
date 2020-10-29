package chap18.textbook.s180402;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamExample {
	public static void main(String[] args) throws Exception {
		try {
			InputStream fis = new FileInputStream(
					"src/chap18/textbook/s180402/FileInputStreamExample.java");
			int data;
			
			while ((data = fis.read()) != -1) {
				System.out.write(data); 
				//바로 char로 바꾸어주는 method
			}
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
