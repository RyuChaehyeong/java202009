package codingbat.logic_1;

public class BlueTicket {
	public int blueTicket(int a, int b, int c) {
		int sum_ab = a + b;
		int sum_bc = b + c;
		int sum_ca = c + a;

		if (sum_ab == 10 || sum_bc == 10 || sum_ca == 10) {
			return 10;
		} else if (sum_ab == (sum_bc + 10) || sum_ab == (sum_ca + 10)) {
			return 5;
		}
		return 0;
	}
}
