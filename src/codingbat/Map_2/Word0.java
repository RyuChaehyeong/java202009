package codingbat.Map_2;

import java.util.HashMap;
import java.util.Map;

public class Word0 {
	public Map<String, Integer> word0(String[] strings) {
		// by using hashMap

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String str : strings) {
			String s = str;
			Integer v = 0;
			if (!map.containsKey(str)) {
				map.put(str, v);
			}

		}
		return map;
	}
}
