package chap10.textbook.s100701;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("예금액: "+account.getBalance());
		
		//출금하기
		try {
			account.withdraw(30000);
			
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			
			//이 코드는 어디서 Exception 발생했는지, 호출 루트 알려줌
			//꼭 써야 함
			e.printStackTrace();
		}
	}
}
