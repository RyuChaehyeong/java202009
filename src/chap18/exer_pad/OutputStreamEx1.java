package chap18.exer_pad;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx1 {
	public static void main(String[] args) throws Exception {
		String path = "output1.txt";
		OutputStream os = new FileOutputStream(path);
		
		os.write(65);
		os.write(66);
		
		byte[] ar_data = new byte[5];
		ar_data[0] = 67;
		ar_data[1] = 68;
		ar_data[2] = 69;
		
		os.write(ar_data);
		os.write(ar_data, 0, 2);
		
		os.close();
	}
}
