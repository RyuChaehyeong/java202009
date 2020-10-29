package chap18.textbook.exercise.p07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		//정확한 경로를 수정하세요
		String filePath = "src/chap18/textbook/exercise/p07/AddLineNumberExample.java";
		//작성 위치
		int cnt = 1;
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		String s; 
		
		while ((s=br.readLine()) != null) {
			System.out.println(cnt+". "+s);
			cnt++;
		}
		br.close();
		fr.close();
	}
}
