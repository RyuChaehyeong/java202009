package chap18.lecture.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx1 {
	public static void main(String[] args) throws Exception {
		String path = "output.txt";
		OutputStream os = new FileOutputStream(path);
		
		//쓰는 메소드: write(정수)한 바이트 씩 씀 4byte 중 1byte만
		os.write(65);
		os.write(66);
		
		byte[] ar_data = new byte[5];
		ar_data[0] = 67;
		ar_data[1] = 68;
		ar_data[2] = 69;
		
		os.write(ar_data); //write(배열)
		os.write(ar_data, 0, 2);
		//write(바이트 배열 이름 / 바이트 배열의 시작위치, / 길이) => 67, 68만 쓰는 것임
		//			0부터 2글자
		
		os.close();
	}
}
