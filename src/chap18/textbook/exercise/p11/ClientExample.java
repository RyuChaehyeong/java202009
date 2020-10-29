package chap18.textbook.exercise.p11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("172.30.1.47", 5001);
		OutputStream os = socket.getOutputStream();
		
		String filePath = "bts.jpg";
		File file = new File(filePath);
		
		String fileName = file.getName();
		//작성위치: 클라이언트는 파일 이름이 저장된 길이 100바이트를 먼저 보냅니다.
		byte[] bytes = new byte[100];
		fileName.getBytes(0, fileName.length(), bytes, 0);
		os.write(bytes);
		
		
		System.out.println("[파일 보내기 시작]" + fileName);
		//작성위치: 파일 데이터를 보냅니다.
		FileInputStream fis = new FileInputStream(file);
		int len = 0;
		while((len = fis.read(bytes)) != -1) {
			os.write(bytes, 0, len);
		}	
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
		
	}
}
