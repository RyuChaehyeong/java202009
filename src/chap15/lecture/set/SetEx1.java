package chap15.lecture.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		//순서가 없고 중복되지 않음
		Set<String> set = new HashSet<String>();
		//Set은 인터페이스라 객체 못만듦 
		
		//추가
		set.add("java");
		set.add("html");
		set.add("css");
		set.add("dbms");
		set.add("jsp");
		set.add(new String("java")); //중복이면 교체하지 않음
		//새 객체 만들어도 hashCode도 같고 equals도 같다고 나옴
		
		System.out.println(set.size());
		
		//set은 순서가 없으니까 인덱스를 저장하지 않음
		set.remove("jquery");
		System.out.println(set.size());
		set.remove(new String("html"));
		//새 객체 만들어도 hashCode도 같고 equals도 같다고 나옴
		System.out.println(set.size());
		
		//set메소드는 없다.
		//검색
		//순서가 없어서 모두 탐색해야함
		System.out.println("===향상된 for===");
		for (String s : set) {
			System.out.println(s);
		}
		
		Iterator<String> iter = set.iterator();
		//탐색 목적으로 만들어진 클래스
		iter.hasNext(); //다음에 탐색할 것이 있는지
		iter.next(); //다음것을 탐색
		System.out.println("===Iterator===");
		while (iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
	}
}
