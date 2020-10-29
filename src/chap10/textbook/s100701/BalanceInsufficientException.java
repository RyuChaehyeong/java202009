package chap10.textbook.s100701;


//checked Exception 만들고 싶으면 extends Exception
//unchecked Exception 만들고 싶으면 extends RuntimeException
//생성자 2개 파라미터 있/없

public class BalanceInsufficientException extends Exception{
	//사용자 정의 예외 클래스
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		//파라미터로 받은 메세지가 super안에 알아서 잘 저장됨
		super(message);
	}
}
