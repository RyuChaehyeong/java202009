package codingbat.Map_2;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap<>();

		for (String str : strings) {
			String front = "" + str.charAt(0);
			String back = "" + str.charAt(str.length() - 1);

			map.put(front, back);
		}

		return map;
	}

}
