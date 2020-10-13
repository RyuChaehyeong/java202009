package chap04.textbook;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i%2 != 0) continue;
				//홀수 인 경우 여기 아래 코드부터 실행x
			
			System.out.println(i);
			
		}
	}
}
