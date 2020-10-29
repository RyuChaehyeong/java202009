package chap07.textbook.s070402;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			//Airplane 객체의 fly() 메소드 호출
			super.fly(); //조건에 따라 상위클래스의 fly() 실행
			//super가 인스턴스, 근데 상위클래스 생성자 쓴적없는디?..>>superConstructor package로..
		}
	}
}
