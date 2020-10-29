package chap06.exercise.p20_3;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	static int cnt = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("=================================================");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("=================================================");
			System.out.print("선택> ");
			int selectNo = sc.nextInt();
			
			switch(selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("시스템을 종료합니다.");
	}

	private static void createAccount() {
		System.out.println("----------");
		System.out.println(" 계좌생성 ");
		System.out.println("----------");
		String ano;
		String owner;
		int balance;
		System.out.print("계좌번호");
		ano = sc.next();
		System.out.print("계좌주");
		owner = sc.next();
		System.out.print("초기입금액");
		balance = sc.nextInt();
		System.out.println("계좌가 생성되었습니다.");
		
		Account account = new Account(ano, owner, balance);
		accountArray[cnt] = account;
		cnt++;
	}
	
	private static void accountList() {
		System.out.println("----------");
		System.out.println(" 계좌목록 ");
		System.out.println("----------");
		for (int i = 0; i < cnt; i++) {
			Account cur = accountArray[i];
			System.out.println(cur.getAno()+"\t"+cur.getOwner()+"\t"+cur.getBalance());
		}
	}
	private static void deposit() {
		System.out.println("----------");
		System.out.println(" 입금 ");
		System.out.println("----------");
		String ano;
		int add;
		System.out.print("계좌번호: ");
		ano = sc.next();
		System.out.print("입금액: ");
		add = sc.nextInt();
		Account cur = findAccount(ano);
		int sum = cur.getBalance()+add;
		cur.setBalance(sum);
		System.out.println("입금완료");
	}
	private static void withdraw() {
		System.out.println("----------");
		System.out.println(" 출금 ");
		System.out.println("----------");
		String ano;
		int add;
		System.out.print("계좌번호: ");
		ano = sc.next();
		System.out.print("출금액: ");
		add = sc.nextInt();
		Account cur = findAccount(ano);
		int sum = cur.getBalance()-add;
		cur.setBalance(sum);
		System.out.println("출금완료");
	}
	
	private static Account findAccount(String ano) {
		
		for (int i = 0; i < cnt; i++) {
			if(ano.equals(accountArray[i].getAno())) {
				return accountArray[i];
			}
		}
		return null;
		}
	


}
