package codingbat.Warmup_2;

public class StringSplosion {
	public String stringSplosion(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			String repeat = str.substring(0, i + 1);
			res += repeat;
		}
		return res;
	}

}
