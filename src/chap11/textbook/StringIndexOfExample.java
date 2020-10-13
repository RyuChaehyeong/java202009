package chap11.textbook;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int zero = subject.indexOf(" ");
		System.out.println(zero);
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바")!= -1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련없는 책이군요");
		}
		
		//indexOf로 찾는 결과가 없는 경우 -1이 return;
		//특정 string 이 있는지 없는지 확인가능
		
	}
}
