package chap05.array;

public class ArrayCopyEx02 {
	public static void main(String[] args) {
		int[][] arr1= {
				{3,4},
				{88,99},
				{2,1}
		};
		
		int[][] arr2= new int[arr1.length][];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i]; //참조값을 복사함!! (얕은 복사)
		}
		//같은 참조값을 참조하고 있는 부분의 값들이 다 바뀜
		arr1[0][0] = 100;
		for(int[] arr:arr2) {
			for(int n : arr) {
				System.out.println(n);
			}
		}
	}
}
