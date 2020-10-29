package chap18.textbook.s180405;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		String src = "src/chap18/textbook/s180405/FileCopy.java";
		String des = "file-copy.txt";
		Reader reader = new FileReader(src);
		Writer writer = new FileWriter(des);

		int data;
		while ((data = reader.read()) != -1) {
			writer.write(data);
		}
		System.out.println("종료");
		reader.close();
		writer.close();
	}
}
