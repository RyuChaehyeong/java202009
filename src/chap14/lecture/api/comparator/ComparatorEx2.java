package chap14.lecture.api.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComparatorEx2 {
	public static void main(String[] args) {
		Random random = new Random();
		List<Member> list = new ArrayList<Member>();
		
		for (int i = 0; i < 10; i++) {
			list.add(new Member(random.nextInt(100), "java"));
		}
		list.sort((a,b) -> a.getId() - b.getId());
		/*sort의 타입파라미터 타입이 둘다 member이지
		member는 다 getId()메소드를 가지고 있지!*/
		list.forEach(e -> System.out.println(e));
	}
}
