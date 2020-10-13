package chap06.lecture.constructor;

public class Car {
	String name;
	int price;
	
	// (1) 기본생성자
	public Car() {
		System.out.println("생성자 실행됨");
		//생성자가 하는일: 필드 초기화
		name = "kia";
		price = 500;	
	}
	
	//(2) 생성자는 파라미터를 받을 수도 있다
	public Car(String carName) {
		System.out.println("String 받는 생성자 실행됨");
		System.out.println(carName+"입니다.");
		name = carName;
	}
	
	//(3) 다르게 파라미터를 받을 수도 있음
	public Car(String carName, int carPrice) {
		name = carName;
		price = carPrice;
	}
}
//넣어준 파라미터를 보고 어떤 생성자를 호출할지 결정한다.