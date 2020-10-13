package chap04.textbook;
	//자동 줄 맞춤 단축키 ctrl+shift+f
public class IfElseExample {
	public static void main(String[] args) {
		int score = 85;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("A등급");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("B등급");
		}
	}
}
