package chap18.exer_pad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputExample2 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/exer_pad/InputExample2.java";
		InputStream is = new FileInputStream(path);
		
		byte[] ar_data = new byte[10];
		int readCnt = 0;
		
		while ((readCnt = is.read(ar_data)) != -1) {
			for (int i = 0; i < ar_data.length; i++) {
				System.out.print((char)ar_data[i]);
			}
		}
	}
}

/*read( ): Returns:the total number of bytes read into the buffer, 
 * or -1 if there is no more data 
 * because the end of the stream has been reached.*/
