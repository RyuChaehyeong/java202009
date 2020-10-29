package chap18.exer_pad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/exer_pad/InputStreamEx1.java";
		InputStream is = new FileInputStream(path);
		int read = 0;
		
		while ((read = is.read()) != -1) {
			System.out.print((char)read);
		}
		is.close();
	}
}
