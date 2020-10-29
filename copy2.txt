package chap18.exer_pad;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception{
		String origianlFileName = 
				"src/chap18/exer_pad/FileOutputStreamExample.java";
		String targetFileName =
				"copy2.txt";
		
		InputStream is = new FileInputStream(origianlFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		
		while((readByteNo = is.read(readBytes)) != -1) {
			os.write(readBytes, 0, readByteNo);
		}
		System.out.println("복사완료");
	}
}
