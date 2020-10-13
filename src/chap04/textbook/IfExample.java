package chap04.textbook;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("A등급");
		}

		if (score < 90) {
			System.out.println("점수가 90보다 작습니다");
		}
		System.out.println("B등급");

	}
}
