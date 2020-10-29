package chap18.lecture.filterstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamEx1 {
	//InputStream을 도와줌
	public static void main(String[] args) throws Exception {
		//buffer: 중간에 저장하는 메모리 일부분
		//하드디스크 읽을 때 앞으로 읽을거같은 것도 버퍼에 담아서 속도가 빠르게 함
		String path = "01. 기본 타입과 참조 타입의 차이.png";
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		long start = System.currentTimeMillis();
//		while(fis.read() != -1) { //82ms
		while(bis.read() != -1) { //1ms 앞으로 읽을 몇 바이트를 buffer에 저장
			
		}
		long end = System.currentTimeMillis();
		System.out.println("총 읽은 시간"+(end-start)+"ms");
		fis.close();
	}
}
