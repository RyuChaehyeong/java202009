package chap06.textbook.s060802;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car myCar2 = new Car();
		
		myCar.setGas(5);
		myCar2.setGas(8);
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("가스 주입 필요없음");
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
