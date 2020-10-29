package codingbat.Map_2;

import java.util.HashMap;
import java.util.Map;

public class WordLen {
	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		for (String str : strings) {
			String s = str;
			int len = str.length();
			map.put(s, len);
		}

		return map;
	}

}
