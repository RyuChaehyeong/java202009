package chap06.exercise.p20m;

import java.util.Scanner;

public class BankApplicationM {
	private static AccountM[] accountArray = new AccountM[100];
	private static Scanner sc = new Scanner(System.in);
	static int cnt = 0; //static int cnt;

	public static void main(String[] args) {
		boolean run = true;
		cnt = 0;
		while (run) {
			System.out.println("=====================================================");
			System.out.println("| 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 |");
			System.out.println("=====================================================");
			System.out.println("선택");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				creatAccount();
				cnt++;
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
	private static void creatAccount() {
		String ano;
		String owner;
		int money;
		//변수를 먼저 선언 안해줬다. 
		
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌번호: ");
		ano = sc.next();
		System.out.print("계좌주: ");
		owner = sc.next();
		System.out.print("초기입금액: ");
		money = sc.nextInt();

		
		AccountM account = new AccountM(ano, owner, money);
		//리스트 공간에 그냥 들어가는 줄 알고 객체 생성안해줬다.
		//처음에 필드에 값넣을 때도 getter, setter로 해야하는 줄 알았다.
		// 		근데 그냥 위에서 입력받은 생성자로 객채 생성함.
		accountArray[cnt] = account;
		//입력받은 파라미터로 객체 생성한 거를 accountArray에 하나씩 넣어줌
		cnt++;
		//1씩 늘어나는 변수 있어야 해서 cnt 전역으로 선언
		System.out.println("결과: 계좌가 생성되었습니다.");
	
	}
	//계좌목록보기
	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		for (int i = 0; i < cnt; i++) {
			AccountM cur = accountArray[i];
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
		ano =sc.next();
		System.out.print("예금액: ");
		money = sc.nextInt();
		
		AccountM cur = findAccount(ano);
		int sum  = cur.getBalance()+money;
		cur.setBalance(sum);
		
		System.out.println("예금이 성공되었습니다.");
	}
	
	//출금하기
	private static void withdraw() {
		System.out.println("---------------------------");
		System.out.println("출금");
		System.out.println("---------------------------");
		String ano;
		int money;
		System.out.print("계좌번호: ");
		ano =sc.next();
		System.out.print("출금액: ");
		money = sc.nextInt();
		
		AccountM cur = findAccount(ano);
		int sum = cur.getBalance()-money;
		cur.setBalance(sum);
		
		System.out.println("예금이 성공되었습니다.");
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static AccountM findAccount(String ano) {
		for(int i = 0; i < cnt; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}
			
		
	}

