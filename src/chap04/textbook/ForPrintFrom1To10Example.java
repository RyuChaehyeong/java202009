package chap04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		System.out.println("====1~10====");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("====11~20====");
		for (int i = 11; i < 21; i++) {
			System.out.println(i);
		}
		
		System.out.println("====1~9 홀수====");
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("====10~1====");
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		System.out.println("====10~2 짝수====");
		for (int i = 10; i >1 ; i-=2) {
			System.out.println(i);
			
		}
		
	}
}
