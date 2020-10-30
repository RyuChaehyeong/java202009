package codingbat.Map_2;

import java.util.HashMap;
import java.util.Map;

public class WordCount2 {
	public Map<String, Integer> wordCount(String[] strings) {

		Map<String, Integer> map = new HashMap<>();
//		for(String s : strings) {
//			
//			if(map.containsKey(s)) {
//				int v = map.get(s);
//				map.put(s, v+1);
//			} else {
//				map.put(s, 1);
//			}
//		}
//		
		for (String s : strings) {
			map.compute(s, (k, v) -> v == null ? 1 : v + 1);
			//map.compute(s, (k, v) -> v == null ? 1 : v + 1); map.compute(s, BiFunction)
		}

		return map;
	}

}
