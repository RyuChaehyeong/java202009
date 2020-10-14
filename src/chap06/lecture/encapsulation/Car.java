package chap06.lecture.encapsulation;

public class Car {
	// 필드는 보통 private
	private int speedKm;


	// 대신 메소드를 노출시킴
	public void setSpeed(int speed) {
		if (speed >= 0) {
			this.speedKm = speed;
		}
	}

	public int getSpeed() {
		return this.speedKm;
	}
}
