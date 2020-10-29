package chap12.textbook.s120401;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		//user1, 2에 같은 인스턴스를 넣음
		//setMemory가 다른 실행 흐름에서 동시에 실행
		//100이아니고 50으로 남아있냐면 
		//user2의 실행흐름에서 50으로 바뀐 것을 100으로 바꿈
		//setMemory를 종시에 실행할 수 없게함
	}
}
