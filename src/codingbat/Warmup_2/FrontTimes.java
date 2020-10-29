package codingbat.Warmup_2;

public class FrontTimes {
	public String frontTimes(String str, int n) {
		String front3 = str;
		String res = "";

		if (str.length() >= 3) {
			front3 = str.substring(0, 3);
		}

		for (int i = 0; i < n; i++) {
			res += front3;
		}

		return res;
	}
}
