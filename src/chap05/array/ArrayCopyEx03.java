package chap05.array;

public class ArrayCopyEx03 {
	//그림판 중...
	public static void main(String[] args) {
		int[][] arr1 = {{3,4},{88,99},{2,1}};
		int[][] arr2 = new int[arr1.length][];
		
		for (int i = 0; i < arr1.length; i++) {
			int[] newArr = new int[arr1[i].length];
			
			for (int j = 0; j < arr1[i].length; j++) {
				newArr[j]=arr1[i][j];
			}
			arr2[i]= newArr;
		
		}
		
		arr1[0][0]=100;
		
		for (int[] arr : arr2) {
			for (int n : arr) {
				System.out.println(n);
			}
		}
		//새로운 배열을 복사해서 값을 변경해도
		//값이 바뀌지 않음.
		
		
	}
}
