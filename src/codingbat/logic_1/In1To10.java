package codingbat.logic_1;

public class In1To10 {
	public boolean in1To10(int n, boolean outsideMode) {
		boolean res = false;
		if (!outsideMode && n >= 1 && n <= 10) {
			res = true;
		}
		if (outsideMode) {
			if (n <= 1 || n >= 10) {
				res = true;
			}
		}
		return res;
	}
}
