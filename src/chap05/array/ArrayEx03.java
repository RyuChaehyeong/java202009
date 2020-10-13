package chap05.array;

public class ArrayEx03 {
	public static void main(String[] args) {
		
		int  a = myMethod(3);
		System.out.println(a);
		
		a = myMethod(4);
		System.out.println(a);
		
		a = myMethod(50);
		System.out.println(a);
	
		int[] arr1 = new int[] {9, 8, 7};
		a = myMethod2(arr1); 
		System.out.println(a);
		
		int[] arr2 = new int[] {99, 88, 77};
		a= myMethod2(arr2); //참조값을 저장하는 변수를 넣나
		System.out.println(a);
		
		a = myMethod2(new int[] {22, 33, 44}); 
		//인스턴스 참조값 자체를 넣나 상관없음 (참조값이 바로 들어감)
		System.out.println(a);
	}
	
	public static int myMethod2(int[] arr) {
		System.out.println("=====myMethod2 시작====");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i]; //arr이 parameter의 참조값을 참조
		}
		System.out.println("=====myMethod2 종료====");
		System.out.println("");
		return sum;
	}
	
	public static int myMethod(int i){
		int res = i*2;
		//리턴타입  메소드명  (파라미터)
		return res;
	}
}
