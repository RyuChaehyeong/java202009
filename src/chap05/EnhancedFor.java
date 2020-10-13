package chap05;

public class EnhancedFor {
	public static void main(String[] args) {
		int[] arr = {4, 5, 6, 7, 8};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("==========enhanced for==========");
		for(int n : arr) {
			//arr의 전체 값을 처음부터 끝까지 활용하여
			//for문 안쪽 코드블럭 실행
			//n에 값이 저장됨
			System.out.println(n);
		}
	}
}
