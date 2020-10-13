package chap04.textbook;

public class SwitchCharExample {
	public static void main(String[] args) {
		int ran = (int) (Math.random()*3);
		char grade = (char) ('A'+ran);
		System.out.println("등급: " +grade);
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원");
			break;
		
		case 'B':
		case 'b':
			System.out.println("일반 회원");
			break;
			
		default:
			System.out.println("손님");
	
		}
	}
}
