package codingbat.Warmup_2;

public class DoubleX_hard {
	boolean doubleX(String str) {
		int i = 0;
		for (i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x') {
				if (str.substring(i, i + 2).equals("xx")) {
					return true;
				} else {
					return false;
				}
			}
		}

		return false;
	}
}
