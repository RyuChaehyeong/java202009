package chap14.lecture.methodref;

import java.util.Random;
import java.util.function.Supplier;

public class MethodRefEx1 {
	public static void main(String[] args) {
		/***파라미터와 리턴타입이 다 똑같으면 메소드 참조 문법을 쓰면 된다.***/
		
		/*static method, 예시1*/
		Supplier<Double> random = () -> Math.random();
		//다른 메소드 호출하고 끝난다면 메소드 참조라는 문법을 사용할 수 있다.
		Supplier<Double> ran2 = Math::random; //클래스명 :: 메소드명
		
		/*인스턴스 method, 예시2*/
		Random rand = new Random();
		Supplier<Integer> nextInt = ()  -> rand.nextInt();
		Supplier<Integer> nextInt2 = rand::nextInt; //인스턴스 명으로
		
		/*예시3*/
		Supplier<Car> nextCar = ()-> new Car(); 
		//만들어 놓은 Supplier 객체가 하는일이 새로 Car 객체를 만드는 일로 똑같다면?
		Supplier<Car> nextCar2 = Car::new; //참조 문법 사용가능
		
		Car c1 = nextCar2.get();
		c1.name = "빵빵이";
		System.out.println(c1.name);
		
		Supplier<IPhone> nextIPhone = () -> new IPhone("white");
		IPhone i1 = nextIPhone.get();
		System.out.println(i1.color);	
	}
}

class Car {
	public String name;
}

class IPhone {
	public String color;
	
	public IPhone(String color) {
		this.color = color;
	}
}
