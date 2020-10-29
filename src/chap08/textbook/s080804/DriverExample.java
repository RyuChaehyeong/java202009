package chap08.textbook.s080804;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		driver.drive(new Taxi());
		
		
	}
}
