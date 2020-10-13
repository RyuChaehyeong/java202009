package chap04.textbook;

import java.util.Scanner;


public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner sc = new Scanner(System.in);//System.in은 키보드
		//키보드로부터 입력받은 것을 scan함
		String inputString;
		
		do {
			System.out.println(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
			
		} while (!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
	}
}
