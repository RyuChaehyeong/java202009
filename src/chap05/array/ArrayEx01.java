package chap05.array;

public class ArrayEx01 {
	public static void main(String[] args) {
		int i1 = 30;
		int i2 = 50;
		int i3 = 20;
		int i4 = 70;
		
		int[] arr1; //integer을 여러개 저장, integer 배열타입 (참조타입)
		arr1  = new int[3]; //new type[저장 공간 개수]
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		arr1[0] = 99;
		arr1[1] = 88;
		arr1[2] = 77;
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		int[] arr2;
		arr2 = arr1;
		arr2[0] = 55; //arr2[0]의 값을 바꾸면
		
		System.out.println(arr2[0]);
		System.out.println(arr1[0]); //얘도 55로 바뀜 ..같은 인스턴스 참조 하고 있다는 의미
		
	}
}
