package chap04.exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0;
		int money = 0;
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("=================================================");
			System.out.println("| 1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
			System.out.println("=================================================");
			System.out.printf("선택>");
			
			int choice = Integer.valueOf(sc.nextLine());
			
			
			
		
			switch (choice) {
			case 1:
				System.out.printf("예금액>");
				money = Integer.valueOf(sc.nextLine());
				balance += money;
				break;
			case 2:
				System.out.printf("출금액>");
				money = Integer.valueOf(sc.nextLine());
				balance -= money;
				break;
			case 3:
				System.out.printf("잔고>"+balance);
				break;
			case 4:
				System.out.println("프로그램 종료");
				run = false;
				break;
			}
			
		System.out.println("");	
		}
	}
}






























