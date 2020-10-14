package chap06.lecture.encapsulation;

public class MyApp {
	public static void main(String[] args) {
		Car c1 = new Car();
//		c1.speed = 100;
//		System.out.println(c1.speed);
//		c1.speed = -100; //데이터를 노출시키면 데이터 바로 변경 가능
		
		c1.setSpeed(300);
		System.out.println(c1.getSpeed());
		c1.setSpeed(-300);
		System.out.println(c1.getSpeed()); //여전히 300
	}
}
