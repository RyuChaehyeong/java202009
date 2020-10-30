package chap14.lecture.api.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ComparatorEx1 {
	public static void main(String[] args) {
		Random random = new Random();
		//음수, 0, 양수 중 리턴
		/*
		 * 왼쪽이 작으면 음수
		 * 같으면 0
		 * 왼쪽이 크면 양수
		 * 
		 * 
		 * */
		Comparator<Integer> asc = (x, y) -> x-y; //정렬
//		Comparator<Integer> asc = (x, y) -> y-x; (역정렬)
		//정렬할 때 사용		
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			list.add(random.nextInt(100));
		}
		
		
		list.forEach(e -> System.out.println(e));
		list.sort(asc);
		//정렬시 기능을 Comparator로
		System.out.println("-----정렬 후");
		list.forEach(e -> System.out.println(e));
	}
}
