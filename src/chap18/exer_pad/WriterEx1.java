package chap18.exer_pad;

import java.io.FileWriter;
import java.io.IOException;

public class WriterEx1 {
	public static void main(String[] args) throws Exception {
		String path = "writer1.txt";
		FileWriter fw = new FileWriter(path);
		fw.write("한");
		
		char[] arr = new char[5];
		arr[0] ='자';
		arr[1] ='바';
		arr[2] ='신';
		arr[3] ='용';
		arr[4] ='권';
		fw.write(arr);
		fw.write(arr, 2, 3);
		fw.write("\n이거시 자바다");
		fw.close();
	}
}
