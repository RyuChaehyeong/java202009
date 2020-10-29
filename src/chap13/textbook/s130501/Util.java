package chap13.textbook.s130501;

public class Util {
	//메소드에 타입파라미터1
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t1.doubleValue();
		return Double.compare(v1, v2);
	}
}
