package chap07.textbook.s070803;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone();
		
		SmartPhone smartphone = new SmartPhone("홍길아");
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
	}
}
