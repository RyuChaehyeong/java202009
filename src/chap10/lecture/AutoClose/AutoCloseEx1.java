package chap10.lecture.AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutoCloseEx1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		// 파일을 읽는 객체 **
		try {
			fis = new FileInputStream("file.txt");
			;
			;
			;
			// 사용한 곳에서 잘 닫아야 함
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) { // nullPointException 발생가능
				try {
					fis.close(); // 닫는 코드는 finally block안에 있어야 함
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} // null 체크하고 닫아주는 코드 (21~27) => 알아서 닫아주는 방법

			}
			// try-with-resources
		try (FileInputStream fis2 = new FileInputStream("file.txt");
				FileInputStream fis3 = new FileInputStream("file2.Ftxt");) {
			// try 둥근괄호에 쓰면 final check도 하고 알아서 닫아줌
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
