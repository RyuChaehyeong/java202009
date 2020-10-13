package chap05.textbook;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores["+i+"] : "+scores[i]);
			sum += scores[i];
		}
		
		System.out.println("총합: "+sum);
		double avg = (double)sum / 3;
		System.out.println("평균: "+avg);
	}
}

