package chap05.matrixArray;

public class MatrixArrayEx01 {
	public static void main(String[] args) {
		int[][] matrix = new int[3][2];
		//배열을 저장하는 배열
		
		int[]arr = new int[3];
		System.out.println(arr.length);
		
		System.out.println(matrix[0].length);
		System.out.println(matrix[1].length);
		System.out.println(matrix[2].length);
		//matrix의 첫번째 원소도 배열이니까 속성이 있어서 메서드 사용가능
		
		matrix[0][0] = 9;
		
	}
}
