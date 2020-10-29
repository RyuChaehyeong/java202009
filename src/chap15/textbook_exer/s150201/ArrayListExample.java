package chap15.textbook_exer.s150201;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Java");
		list.add("Servlet/JSP");
		list.add(2, "Database"); //2번 인덱스 자리에 수정
		
		int size = list.size();
		String skill = list.get(2);
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
			
		}
		
		list.remove(2);
		// List에서는 빈공간이 없도록! 앞자리가 비면 앞으로 땡긴다.
		//중복
		
	}
}
