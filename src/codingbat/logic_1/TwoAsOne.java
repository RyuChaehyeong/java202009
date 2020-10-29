package codingbat.logic_1;

public class TwoAsOne {
	public boolean twoAsOne(int a, int b, int c) {
		  return (a+b == c)||(b+c == a)||(a+c == b);
		}
}
