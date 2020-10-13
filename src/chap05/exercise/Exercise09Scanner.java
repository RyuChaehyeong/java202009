package chap05.exercise;

import java.util.Scanner;

public class Exercise09Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력> ");
		String str = sc.nextLine(); //엔터 치기 전까지 입력한 문자열이 return되어 str에 저장
		int val = Integer.valueOf(str); //string -> int
		
		System.out.print("출력> ");
		System.out.println(val);
		
		
		System.out.print("정수입력>");
		val = sc.nextInt(); 
		System.out.print("정수출력>");
		System.out.println(val);
		
		
		
		
	}
}
