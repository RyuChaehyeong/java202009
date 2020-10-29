//한글
package chap18.lecture.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class ReaderEx1 {
	//바이트 단위말고, 문자 단위로 읽을 필요성
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/reader/ReaderEx1.java";
		Reader reader = new FileReader(path);
		
		//char는 2byte
		int ch = reader.read(); //한 번 읽음
		System.out.println(ch); // 결과: 47
		System.out.println((char)ch); // 결과: /
		
		reader.read(); //두 번 읽음
		ch = reader.read(); //세 번 읽고 integer로 저장
		System.out.println((char)ch); //integer를 character로 변환 후 출력
		
		reader.close();
		
		//inputStream - 한바이트씩
		InputStream is = new FileInputStream(path);

		System.out.println((char)is.read()); //결과: /
		System.out.println((char)is.read()); //결과: /
		System.out.println((char)is.read()); //정상 출력x
		is.close();
	}
}
