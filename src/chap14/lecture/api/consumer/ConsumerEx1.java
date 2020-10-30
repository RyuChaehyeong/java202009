package chap14.lecture.api.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx1 {
	public static void main(String[] args) {
		Consumer<Integer> con1 = x -> System.out.println(x*2); 
		//Consumer의 accept 재정의
		con1.accept(30);
		
		System.out.println("====list forEach method====");
		List<Integer> list = new ArrayList<Integer>();
		list.add(30);
		list.add(70);
		list.add(77);
		list.add(11);
		list.add(33);
		
		list.forEach(con1); //list의 forEach( )는 파라미터로 Consumer을 받음
		System.out.println("=== list forEach2 ===");
		
		list.forEach(x -> System.out.println("items: "+x));
	}

}
