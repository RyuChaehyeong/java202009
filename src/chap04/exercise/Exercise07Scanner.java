package chap04.exercise;

import java.util.Scanner;

public class Exercise07Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력");
		String line = sc.nextLine();
		
		System.out.println("출력");
		System.out.println(line);
		
		int num = Integer.valueOf(line);
		int i = num * 2;
		System.out.println(i);
	}
}
