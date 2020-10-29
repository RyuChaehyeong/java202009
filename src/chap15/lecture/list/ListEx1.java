package chap15.lecture.list;

import java.util.List;
import java.util.ArrayList;

public class ListEx1 {
	public static void main(String[] args) {
		//순서가 있고 중복허용
		List<String> list = new ArrayList<>();
		//요소의 타입은 타입파라미터로 결정
		
		//추가
		list.add("java");
		list.add("html");
		list.add("css");
		list.add("java");
		
		System.out.println(list.size());
		
		//검색
		System.out.println(list.get(1));
		System.out.println(list.get(3));
		
		//수정
		list.set(3, "jsp"); //인덱스 번호, new 값
		System.out.println(list.get(3));
		
		//삭제
		list.remove(2);
		//삭제된것을 빈칸으로 두지 않고 한칸씩 땡김
		System.out.println(list.get(2));
		
		//모든 값 탐색
		System.out.println("모든 요소 탐색 for");
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("모든 요소 탐색 향상된 for");
		for(String s : list) {
			System.out.println(s);
		}
		
		//타입 파라미터
		List<Integer> listInt = new ArrayList<>();
		list.add("servlet");
		listInt.add(3);
		List listNotype = new ArrayList();
		//오브젝트 타입만 받음
		listNotype.add("string");
		listNotype.add(3);
		
		Object o1 = listNotype.get(0);
		Object o2 = listNotype.get(1);//캐스팅 필요
	}
}
