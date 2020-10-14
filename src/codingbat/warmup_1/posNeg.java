package codingbat.warmup_1;

public class posNeg {
	public boolean posNeg(int a, int b, boolean negative) {
		  boolean aneg = a<0;
		  boolean bneg = b<0;
		  return negative? (aneg&&bneg) : (aneg ^ bneg);
		}

}
