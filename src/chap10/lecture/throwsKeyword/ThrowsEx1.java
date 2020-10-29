package chap10.lecture.throwsKeyword;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsEx1 {
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {
		method1();
		//책임을 JVM에게 넘김, 프로그램 종료하고 어디서 에러났는지 알려줌
	}
	
	public static void method1() throws ClassNotFoundException, FileNotFoundException {
		method2();
		//main method로 책임 떠넘김
	}
	
	public static void method2() throws ClassNotFoundException, FileNotFoundException{
		method3();
		//얘를 호출한 다른 곳에서 처리할 책임을 떠넘김
	}
	
	public static void method3() throws ClassNotFoundException, FileNotFoundException {
		//checked excep. 발생코드
//		Class.forName("java.lang.String2");
		Class.forName("java.lang.String");
		//exception여기 method3에서 처리 안하고 
		//얘를 호출한(method2) 다른 곳으로 떠넘기겠다.
		
		FileReader fr = new FileReader("file.txt");
		//FileNotFound exception 발생시키는 생성자
		
		
	}
}
