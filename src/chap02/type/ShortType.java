package chap02.type;

public class ShortType {
	public static void main(String[] args) {
		//short: 2byte
		short shortValue1;
		shortValue1 = 32767;
		System.out.println(shortValue1);
		
//		shortValue1 = 32768; 최대값은 32768까지!
		shortValue1 = -32768;
		System.out.println(shortValue1);
	}
}
