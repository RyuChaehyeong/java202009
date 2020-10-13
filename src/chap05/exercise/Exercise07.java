package chap05.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 8, 3, 5, 2};
		
		//1이랑 5랑 비교. 큰거 저장
		//저장한거랑 3이랑 비교 큰거 저장
				
		for (int i = 0; i < array.length; i++) {
			int num2 = array[i];
			if(max<num2) {
				max = num2;
			} 
		}	
		System.out.println("max: "+max);
	}
}