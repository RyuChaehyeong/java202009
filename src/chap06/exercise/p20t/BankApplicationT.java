package chap06.exercise.p20t;

import java.util.Scanner;

public class BankApplicationT {
	private static AccountT[] accountArray = new AccountT[100];
	private static Scanner sc = new Scanner(System.in);
	private static int size = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("=====================================================");
			System.out.println("| 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 |");
			System.out.println("=====================================================");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				createAccount();
				
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	//계좌생성
	private static void createAccount() {
		String ano;
		String owner;
		int money;
		
		System.out.println("---------------------------");
		System.out.println("계좌생성");
		System.out.println("---------------------------");
		System.out.println("계좌번호: ");
		ano = sc.next();
		System.out.println("계좌주: ");
		owner = sc.next();
		System.out.println("초기입금액: ");
		money = sc.nextInt();
		
		AccountT account = new AccountT(ano, owner, money);
		accountArray[size] = account;
		size++;
		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}
	//계좌목록
	private static void accountList() {
		System.out.println("---------------------------");
		System.out.println("계좌목록");
		System.out.println("---------------------------");
		for (int i = 0; i < size; i++) {
			AccountT cur = accountArray[i];
			System.out.println(cur.getAno()+"\t"+cur.getOwner()+"\t"+cur.getBalance());
		}
	}
	//예금하기
	private static void deposit() {
		System.out.println("---------------------------");
		System.out.println("예금");
		System.out.println("---------------------------");
		String ano;
		int money;
		
		System.out.print("계좌번호: ");
		ano = sc.next();
		System.out.println("예금액: ");
		money = sc.nextInt();
		
		AccountT cur = findAccount(ano);
		int sum = cur.getBalance()+money;
		cur.setBalance(sum);
		
		System.out.println("예금이 성공되었습니다");
	}
	//출금하기
	private static void withdraw() {
		System.out.println("---------------------------");
		System.out.println("출금");
		System.out.println("---------------------------");
		String ano;
		int money;
		
		System.out.print("계좌번호: ");
		ano = sc.next();
		System.out.println("출금액: ");
		money = sc.nextInt();
		
		AccountT cur = findAccount(ano);
		int sum = cur.getBalance()-money;
		cur.setBalance(sum);
		System.out.println("출금이 성공되었습니다");
	}
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static AccountT findAccount(String ano) {
		for (int i = 0; i<size; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
				
			}
		}
		return null;
	}
}
