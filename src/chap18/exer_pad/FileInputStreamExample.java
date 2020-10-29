package chap18.exer_pad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamExample {
	public static void main(String[] args) throws Exception {
		InputStream fis = new FileInputStream("src/chap18/exer_pad/FileInputStreamExample.java");
		int data = 0;
		while ((data = fis. read()) != -1) {
			System.out.write(data);
		}
		fis.close();
	}
}
