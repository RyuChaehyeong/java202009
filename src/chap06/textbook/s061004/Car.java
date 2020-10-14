package chap06.textbook.s061004;

public class Car {
	//=====instance member====
	int speed;
	void run () {
		System.out.println(speed+"으로 달립니다.");
	}
	
	//=====static member=====
	public static void main (String  [] args) {
		//run(); static에서는 instance member에 접근x
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
	/*정적 메소드와 정적 블록을 선언할 때 주의할 점은 객체가 없어도 실행된다는 특징 때문에,
	이들 내부에 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다. */
}
