//얍
package chap18.exer_pad;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/exer_pad/ReaderEx1.java";
		Reader reader = new FileReader(path);
		
		System.out.print((char)reader.read());
		System.out.print((char)reader.read());
		System.out.print((char)reader.read());
	}
}
