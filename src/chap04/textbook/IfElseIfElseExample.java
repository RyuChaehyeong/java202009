package chap04.textbook;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if (score >= 90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("A등급");
		} else if (score >= 80) {
			System.out.println("점수가 90~80입니다.");
			System.out.println("B등급");
		} else if (score >= 70) {
			System.out.println("점수가 80~70입니다.");
			System.out.println("C등급");
		} else {
			System.out.println("점수가 70미만입니다.");
			System.out.println("D등급");
		}
				
	}
}