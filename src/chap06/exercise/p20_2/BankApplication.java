package chap06.exercise.p20_2;

import java.util.Scanner;

public class BankApplication {
	private static Account100[] accountArray = new Account100[100];
	private static Scanner sc = new Scanner(System.in);
	//private static method에서 instance method를 사용할 수 없음. 3
	private static int cnt = 0; //static method에서 사용할거니까 cnt에도 static 붙여야 함!!!!

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("=======================================================");
			System.out.println("| 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 |");
			System.out.println("=======================================================");
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
				if(withdraw()<0) {
					System.out.println("잔액부족");
					break;
				} else {
					
					System.out.println("출금 완료");
					
				};
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
	private static void createAccount() {
		System.out.println("-----------");
		System.out.println("계좌 생성");
		System.out.println("-----------");
		String ano;
		String owner;
		int balance;
		//(2) 생성자 파라미터에 넣어줄 값 sc로 받기 + 메세지 작성
		System.out.print("계좌 번호: ");
		ano = sc.next();
		System.out.print("계좌주: ");
		owner = sc.next();
		System.out.print("초기 입금액: ");
		balance = sc.nextInt();
		
		//account를 만드는 것은 Account100 객체를 만드는 것 -> 생성자 필요 (1)
		Account100 account = new Account100(ano, owner, balance);
		//account 1개 생성한 것
	
		accountArray[cnt] = account;
		//accountArray 100칸에 하나씩...
		cnt++;
		//순서대로 넣어줘야 하니까 cnt 변수(모든 메소드가 알아야 하니까 전역으로) 사용
		
		
	}
	private static void accountList() {
		System.out.println("-----------");
		System.out.println("계좌 목록");
		System.out.println("-----------");
		for (int i = 0; i < cnt; i++) {
			Account100 cur = accountArray[i];
			System.out.println(cur.getAno()+"\t"+cur.getOwner()+"\t"+cur.getBalance());
		}
		
	}
	private static void deposit() {
		System.out.println("-----------");
		System.out.println("입금");
		System.out.println("-----------");
		String ano;
		int money;
		System.out.println("계좌 번호: ");
		ano = sc.next();
		System.out.println("입금할 금액: ");
		money = sc.nextInt();
		
		Account100 cur = findAccount(ano);
		int sum =cur.getBalance()+money;
		cur.setBalance(sum);
		
		System.out.println("예금 완료");
	}
	private static int withdraw() {
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		String ano;
		int money;
		System.out.println("계좌 번호: ");
		ano = sc.next();
		System.out.println("출금할 금액: ");
		money = sc.nextInt();
		
		Account100 cur = findAccount(ano);
		int sum =cur.getBalance()-money;
		return sum;
		
		
	}
	private static Account100 findAccount(String ano) {
		for (int j = 0; j < cnt; j++) {
			if(accountArray[j].getAno().equals(ano)) {
				return accountArray[j];
				
			}
		}
		return null;
	}
	
	
}