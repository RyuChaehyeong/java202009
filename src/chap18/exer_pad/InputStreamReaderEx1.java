//한
package chap18.exer_pad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/exer_pad/InputStreamReaderEx1.java";
		InputStream is = new FileInputStream(path);
		InputStreamReader isr = new InputStreamReader(is);
		
		System.out.print((char)isr.read());
		System.out.print((char)isr.read());
		System.out.print((char)isr.read());
		
		isr.close();
		is.close();
	}
}
