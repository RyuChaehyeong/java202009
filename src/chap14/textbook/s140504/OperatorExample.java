package chap14.textbook.s140504;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = {92, 95, 87};
	
	public static int maxOrmin (IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		//최대값얻기
		int max = maxOrmin(
				(a, b) -> {
					if(a >= b) return a;
					else return b;
				}
				
				);
		System.out.println("최대값: "+max);
		
		//최소값얻기
				int min = maxOrmin(
						(a, b) -> {
							if(a <= b) return a;
							else return b;
						}
						
						);
				System.out.println("최소값: "+min);
	}
}
