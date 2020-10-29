package chap18.lecture.filterstream;

import java.io.IOException;

public class InputStreamReaderEx2 {
	public static void main(String[] args) throws Exception {
		System.out.println("입력: ");
		System.out.println((char) System.in.read()); 
		System.out.println((char) System.in.read()); 
		System.out.println((char) System.in.read()); 
		System.out.println((char) System.in.read()); 
		//한을 누르면 일부만 바이트로 나옴
		
		//InputStreamReader가 필요
		
	}
}
