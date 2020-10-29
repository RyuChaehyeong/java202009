package chap11.textbook.s110302;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap작성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		//다른 인스턴스를 모아서 저장하는 콜렉션 (저장할 때 Key와 Value의 쌍으로 저장)
		
		
		//식별키 "new Key(1)로 "홍길동"을 저장함
		Key k1 = new Key(1);
		hashMap.put(k1, "홍길동");
		
		//식별키 "new Key(1)로 "홍길동"을 읽어옴
		Key k2 = new Key(1);
		System.out.println(k1.hashCode()); //366712642
		System.out.println(k2.hashCode()); //1829164700
		System.out.println(k1.equals(k2));
		//해시코드 재정의 하기 전에 해시코드 값이 다를 때 Key값이 같아도 두 Key type의 객체를
		//같다고 하지 못한다. 
		//해시코드가 같아야 equals가 같을 수 있음
		//Key에 hashCode 재정의하면 같아짐
		String value = hashMap.get(k2);
		System.out.println(value);
		
		//결과: null, 13번 key랑 16번 key가 다름
	}
}
