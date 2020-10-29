package chap18.textbook.s180404;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(
				"src/chap18/textbook/s180404/FileReaderExample.java");
		
		int readCharNo;
		char [] cbuf = new char[100];
		while ((readCharNo = fr.read(cbuf)) != -1) {
			//(100개씩)읽은 문자를 배열에 담음
			
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
			//나도 나오냐 오 나오네
		} 
		fr.close();
	}
}
