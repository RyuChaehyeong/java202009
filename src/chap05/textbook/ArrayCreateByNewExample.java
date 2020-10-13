package chap05.textbook;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}
		//int array는 초기값이 0
		
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		//double array는 초기값이 0.0
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		
		
		String[] arr3 = new String[3];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		//String(참조타입) array는 초기값이 null
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		
	}
}






























