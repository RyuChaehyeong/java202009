package chap04.exercise;

public class Exercise03 {
	public static void main(String[] args) {
		int sum_3 = 0;
		for (int i = 1; i < 100; i++) {
			if(i%3==0) {
				sum_3 += i;
			}
		}
		System.out.println("3의 배수의 합: "+sum_3);
	}
}
