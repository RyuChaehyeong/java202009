package chap18.lecture.filterstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OuterStreamWriterEx1 {
	public static void main(String[] args) throws Exception {
		String path="outputStreamReader.txt";
		FileOutputStream fos = new FileOutputStream(path);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		
//		fos.write('한');
		osw.write('한');
		
		osw.close();
		fos.close();
		
	}
}
