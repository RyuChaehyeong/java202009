package chap15.textbook.s150402;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디 >");
			String id = scanner.nextLine();
			
			System.out.print("비밀번호 >");
			String pw = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인되었습니다");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
	}
}
//key: id, value: pw
//map.containsKey(id): parameter로 받음 key가 있는지 없는지
//map.get(id) : id(key)에 대응하는 pw(value)를 꺼내옴

