package chap18.textbook.s150502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in; 
		//소스는 키보드
		
		Reader reader = new InputStreamReader(is); 
		//문자로 읽을려고 InputStreamReader로 감싸고
		
		BufferedReader br = new BufferedReader(reader); 
		//보조스트림을 또 BufferedReader로 한번 더 감쌈
		
		System.out.print("입력: ");
		String lineString = br.readLine();
		System.out.println("출력: "+lineString);
		
	}
}
