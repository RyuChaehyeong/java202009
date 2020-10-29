package chap10.textbook.exercise.p07;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
		}
		
		try {
			login("blue","54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
		}
	}

	
	//로그인 메소드와 이 메소드 실행 시에 발생할 수 있는 예외 2가지 (id가 틀리는 경우, pw가 틀리는 경우)
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		//id가 "blue"가 아니라면 NotExistException을 발생
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		
		if(!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}
	

}
