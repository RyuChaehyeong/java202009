package codingbat.logic_1;

public class ShareDigit {
	public boolean shareDigit(int a, int b) {

		int al = a / 10;
		int ar = a % 10;
		int bl = b / 10;
		int br = b % 10;

		return (al == bl || al == br || ar == bl || ar == br);

	}

}
