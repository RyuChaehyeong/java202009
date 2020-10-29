package chap18.lecture.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/inputstream/InputStreamEx1.java";
		InputStream is = new FileInputStream(path); 
		
		//작업, 바이트 단위로 읽고 쓰고 있음
		int cnt = 0;
		int r = 0;
		//read() , 한 글자씩 읽는 메소드
		while ((r=is.read()) != -1) {
			System.out.print((char) r);
			cnt++;
		}
		System.out.println(cnt);
		is.close(); //연 쪽에서 닫아줘야댐
	}
}

