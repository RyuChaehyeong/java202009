package chap04.exercise;

public class Exercise05 {
	public static void main(String[] args) {
		int res = 0;
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				res = (4*i) + (5*j);
				if(res == 60) {
					System.out.println("("+i+","+j+")");
				}
			}
		}
	}
}
