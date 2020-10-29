package codingbat.Warmup_2;

public class Last2 {
	public int last2(String str) {
		if (str.length() >= 2) {
			int cnt = 0;
			String last2 = str.substring(str.length() - 2, str.length());

			for (int i = 0; i < str.length() - 1; i++) {
				String check = str.substring(i, i + 2);
				if (check.equals(last2)) {
					cnt++;

				}
			}
			return cnt - 1;
		}
		return 0;
	}

}
