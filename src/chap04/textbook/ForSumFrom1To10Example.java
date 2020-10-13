package chap04.textbook;

public class ForSumFrom1To10Example {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0;
		
		for (i = 1; i <= 100 ; i++) {
			sum += i ;
		}
		System.out.println(i); //101
		//101이 되어서 조건에 안맞아 탈출
		
		System.out.println("1~"+(i-1)+ "합: " +sum );
	}
}
