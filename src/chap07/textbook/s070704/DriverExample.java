package chap07.textbook.s070704;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //자동타입 변환: Vehicle vehicle = bus;
		driver.drive(taxi); //자동타입 변환: Vehicle vehicle = taxi;
		
		//실제 들어온 인스턴스 메소드가 실행된다. 
		//버스가 달립니다.
		//택시가 달립니다.
		
	}
}
