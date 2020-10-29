package chap18.textbook.s180603;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP 주소: "+local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP 주소" +remote.getHostAddress());
				
			}
			
		} catch (UnknownHostException e) {
		
			e.printStackTrace();
		}
	}
	//socket: 연결되는 컴퓨터끼리 socket을 마련하여 InputStream과 OutputStream으로 데이터를 주고 받음
	
}
