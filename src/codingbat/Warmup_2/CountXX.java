package codingbat.Warmup_2;

public class CountXX {
	int countXX(String str) {
		int cnt = 0;
		if (str.length() >= 2) {

			for (int i = 0; i < str.length() - 1; i++) {
				String two = str.substring(i, i + 2);
				if (two.equals("xx")) {
					cnt += 1;
				}
			}
		}
		return cnt;
	}

}
