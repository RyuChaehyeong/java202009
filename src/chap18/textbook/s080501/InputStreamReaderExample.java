package chap18.textbook.s080501;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in; //system class의 static field, 표준inputStream == 키보드
		Reader reader = new InputStreamReader(is);
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		reader.close();
	}
}
