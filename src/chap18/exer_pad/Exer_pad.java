package chap18.exer_pad;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;

public class Exer_pad {
	public static void main(String[] args) throws Exception {
		String path = 
				"src/chap18/exer_pad/Exer_pad.java";
		
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		String s;
		int cnt = 1;
		
		while ((s=br.readLine()) != null) {
			System.out.println(cnt+ ". "+s);
			cnt ++;
		}
		
		br.close();
		fr.close();
		
	}
}
