package codingbat.logic_1;

public class RedTicket {
	public int redTicket(int a, int b, int c) {
		if (a == 2 && b == 2 && c == 2) {
			return 10;
		} else if (a == 1 && b == 1 && c == 1 || a == 0 && b == 0 && c == 0) {
			return 5;
		} else if (a != b && a != c) {
			return 1;
		}
		return 0;
	}

}
