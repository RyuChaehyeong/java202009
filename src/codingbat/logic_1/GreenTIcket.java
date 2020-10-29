package codingbat.logic_1;

public class GreenTIcket {
	public int greenTicket(int a, int b, int c) {
		boolean a_b = a == b ? true : false;
		boolean b_c = b == c ? true : false;
		boolean c_a = c == a ? true : false;

		if (!a_b && !b_c && !c_a)
			return 0;
		if (a_b && b_c && c_a)
			return 20;
		if (a_b && !b_c && !c_a)
			return 10;
		if (!a_b && !b_c && c_a)
			return 10;
		if (!a_b && b_c && !c_a)
			return 10;
		return 0;

	}
}
