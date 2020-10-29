package codingbat.Map_2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
	public Map<String, String> firstChar(String[] strings) {

		Map<String, String> map = new HashMap<>();
		int len = strings.length;
		for (String str : strings) {
			String front = "" + str.charAt(0);
			String res = "";
			for (int i = 0; i < len; i++) {
				String f = "" + strings[i].charAt(0);
				if (f.equals(front)) {
					res += strings[i];
				}
			}
			map.put(front, res);
		}

		return map;
	}
}
