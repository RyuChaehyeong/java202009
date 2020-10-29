package chap15.textbook_exer.s150201;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set  = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servle/JSP");
		set.add("Java");
		
		int size = set.size();
		System.out.println("총 객체 수:"+size);
		
		Iterator<String> iterator = set.iterator();
		//iterator() 리턴타입이 Iterator
		
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println("\t"+str);
		}
		
	}
	//이미 String은 문자열이 같으면 동일한 객체라고 판단하기 위해 hashCode와 equals 메소드가 재정의 되어있음
	//만약 내가 다른 클래스에서도 어떤 필드가 같으면 동일한 객체로 간주하고 싶다면 오버라이딩 해야한다.
	/*
	 *결과 
	총 객체 수:3
	Java
	Servle/JSP
	JDBC
			=> Set은 중복 안됨
	 */
}
