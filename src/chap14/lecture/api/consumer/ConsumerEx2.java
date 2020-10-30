package chap14.lecture.api.consumer;

import java.util.HashMap;
import java.util.Map;

public class ConsumerEx2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("java", 9);
		map.put("html", 3);
		map.put("css", 5);
		map.put("jsp", 2);
		map.put("servlet", 4);
		map.put("jquery", 3);
		
		map.forEach((k, v) -> System.out.println(k+":"+v));
	}
}
