package chap18.exer_pad;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterEx1 {
	public static void main(String[] args) throws Exception {
		String path = "outputStreamEReader11.txt";
		FileOutputStream fos = new FileOutputStream(path);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		osw.write("오");
		osw.write("레");
		osw.write("오");
		
		osw.close();
		fos.close();
		
	}
}
