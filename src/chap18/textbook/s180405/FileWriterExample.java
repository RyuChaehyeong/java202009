package chap18.textbook.s180405;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		File file = new File("file.txt");
		//Creates a new File instance
		
		FileWriter fw = new FileWriter(file, true);
		//Constructs a FileWriter object given a File object. 
		//If the second argument is true, 
		//then bytes will be written to the end of the file rather than the beginning.
		//덮어쓰지 않고 이어서!
		
		fw.write("FileWriter는 한글로된"+"\r\n");
		fw.write("문자열을 바로 출력할 수 있다."+"\r\n");
		fw.flush();
		fw.close();
		System.out.println("파일이 저장되었습니다.");
	}
}
