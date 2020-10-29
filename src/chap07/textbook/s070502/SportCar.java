package chap07.textbook.s070502;

public class SportCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	public void stop() {
		//오버라이드 불가;
	}
}
