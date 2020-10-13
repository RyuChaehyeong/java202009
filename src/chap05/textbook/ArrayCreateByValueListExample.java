package chap05.textbook;

public class ArrayCreateByValueListExample {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for (int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: "+sum1);
		System.out.println("");
		
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합: "+sum2);
		System.out.println("");
		
		int sum3 = add(new int[] {1,2,3});
		System.out.println("총합: "+sum3);
	}
	//1,2,3이라는 값을 가지는 인스턴스의 참조값을 넣어줌
	
	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
