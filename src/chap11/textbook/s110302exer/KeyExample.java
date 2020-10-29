package chap11.textbook.s110302exer;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(1), "홍길동");
		//9번 줄의 new Key(1)과 11번 줄의 new Key(1)은 해시함수 리턴값이 다르다.
		String value = hashMap.get(new Key(1));
		System.out.println(value); //null
	}
}
