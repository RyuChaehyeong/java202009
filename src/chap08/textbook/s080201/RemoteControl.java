package chap08.textbook.s080201;
	//인터페이스 멤버의 접근제한자는 전부 public이다. 
public interface RemoteControl {
	//인터페이스는 필드를 가질수 있는데 가지는 필드는 모두 public static final
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	//static final 생략
	
	//인터페이스 메소드는 모두 public abstract, 생략가능
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);

	
	
	//인스턴스 디폴트 메소드 (하위클래스가 강제구현할 필요는없지만 다 가짐, 
		//재정의하지 않았으면 그대로 쓸 수 있다./ 필요하면 재정의 가능)
		//(body가 있다. 재정의 강제성x, 필요시 오버라이드)
	public default void setMute(boolean mute) {
		//interface에 default keyword를 붙이면 (접근제한자 아님)
		//추상메서드가 아님. 코드블럭 작성가능
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	};
	
	
	
	//static method는 interface이름으로 접근하여 사용가능
	static void changeBattery () {
		System.out.println("건전지를 교환합니다.");
	}
	
}
