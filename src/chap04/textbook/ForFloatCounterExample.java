package chap04.textbook;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		//실수 주의
		for(float x = 0.1f; x <= 1.0f ; x += 0.1f) {
			System.out.println(x);
		}
	}
}
