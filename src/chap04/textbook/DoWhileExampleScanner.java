package chap04.textbook;

import java.util.Scanner;//작성해야 사용할 수 있다.

public class DoWhileExampleScanner {
	public static void main(String[] args) {
		//Scanner 클래스로 sc 객체를 만듦
		Scanner sc = new Scanner(System.in);//System.in은 키보드
		//키보드로부터 입력받은 것을 scan함
		
		System.out.println("입력");
		String line = sc.nextLine(); //enter가 발견될때까지 읽는...
		System.out.println("출력");
		System.out.println(line);
	}
}
