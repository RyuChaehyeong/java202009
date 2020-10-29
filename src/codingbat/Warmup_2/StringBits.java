package codingbat.Warmup_2;

public class StringBits {
	public String stringBits(String str) {
		String neww = "";
		for (int i = 0; i < str.length(); i += 2) {
			neww += str.charAt(i);
		}

		return neww;

	}

}
