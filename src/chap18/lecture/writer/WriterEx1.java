package chap18.lecture.writer;

import java.io.FileWriter;
import java.io.IOException;

public class WriterEx1 {
	public static void main(String[] args) throws Exception {
		String path = "writer.txt";
		FileWriter writer = new FileWriter(path);
		writer.write('한');
		
		char[] arr = new char[5];
		arr[0] = '자';
		arr[1] = '바';
		arr[2] = '신';
		arr[3] = '용';
		arr[4] = '권';
		writer.write(arr);
		writer.write(arr, 2, 3); //신용권
		writer.write("\n이것이자바다"); //문자열도 가능
		writer.close();
	}
}
