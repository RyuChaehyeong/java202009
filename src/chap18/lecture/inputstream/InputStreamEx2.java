package chap18.lecture.inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx2 {
	public static void main(String[] args) throws Exception {
		
	String path = "src/chap18/lecture/inputstream/InputStreamEx2.java";
	InputStream is = new FileInputStream(path);
	
	//여러 바이트는 바이트 배열에
	byte[] ar_data = new byte[10];
	
	int readCnt = 0; 
	int loopCnt = 0;
	while ((readCnt = is.read(ar_data))!= -1) {
		//is.read(ar_data): 파라미터 다름, 오버로딩, 바이트의 길이만큼 최대로 읽음
		//parameter를 배열로 받는 read 메소드는 여러 바이트를 읽음 (여기서는 10byte)
		loopCnt++;
	}
	System.out.println(loopCnt); //몇바이트 읽었는지 읽은 수 체크
	
	is.close();
	}
}
