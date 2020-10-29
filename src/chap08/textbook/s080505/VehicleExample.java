package chap08.textbook.s080505;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare();
		
		//vehicle의 실제 인스턴스가 Bus니까 캐스팅 가능
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare(); //가능
		System.out.println("=====================");
		Driver driver = new Driver();
		driver.drive(vehicle);
		
		System.out.println("============");
		driver.drive(new Bus());
		System.out.println("============");
		driver.drive(new Taxi()); //Driver class의 if-instanceof 구문으로 안전하게 걸러짐
		
	}
}
