package chap15.textbook.exercise.p1605;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
				);
		
		List<String> javaList = new ArrayList<>();
		// 작성 위치
//		javaList.add(list.get(0));		
//		javaList.add(list.get(2));
		
		for(int i = 0; i<list.size(); i++) {
			String item = list.get(i);
			if(item.toLowerCase().contains("java")) {
				javaList.add(item);
			}
		}		
		
		// 출력
		for (String java : javaList) {
			System.out.println(java);
		}
	}
}
