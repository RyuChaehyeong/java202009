package chap05.textbook;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		//1. 처음부터 길이 정해줌
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("mathScores["+i+"]["+j+"]="
						+ mathScores[i][j]);
			}
		}
		
		System.out.println();
		
		int[][] englisgScores = new int[2][];
		//2. 행의 길이만 정해줌
		englisgScores[0] = new int[2];
		englisgScores[1] = new int[3];
		for (int i = 0; i < englisgScores.length; i++) {
			for (int j = 0; j < englisgScores[i].length; j++) {
				System.out.println("englishScores["+i+"]["+j+"]="
						+ mathScores[i][j]);
			}
		}
		System.out.println();
		int[][] javaScores = {
				{95, 80},
				{92, 96, 80}
		};
		//3. 처음부터 값을 저장하는 방법
		
		for (int i = 0; i < javaScores.length; i++) {
			for (int j = 0; j < javaScores[i].length; j++) {
				System.out.println("javaScores["+i+"]["+j+"]="
						+ mathScores[i][j]);
	
			}
		}
	}
}

































