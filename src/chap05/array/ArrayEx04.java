package chap05.array;

public class ArrayEx04 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {99, 88, 77};
		int[] arr2 = {99, 88, 77};
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			System.out.println(arr2[i]);
		}
		
		
		int[] arr3;
		int[] arr4;
		
		arr3 = new int[] {11, 22, 33};
//		arr4 = {11, 22, 33}; //컴파일오류, 변수를 선언함과 동시에 값을 넣을 때만 사용가능
		//값을 다시 넣을 때 이 문법은 사용 못함
	}
}


