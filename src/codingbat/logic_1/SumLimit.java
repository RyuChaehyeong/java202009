package codingbat.logic_1;

public class SumLimit {
	public int sumLimit(int a, int b) {
		String a_ = a + "";
		String sum = a + b + "";
		int res = a_.length() == sum.length() ? a + b : a;
		return res;
	}
	
	
	public static void main(String[] args) {
		SumLimit sumlimit = new SumLimit();
		System.out.println(sumlimit.sumLimit(11, 39));
	}
}
