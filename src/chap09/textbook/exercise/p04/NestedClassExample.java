package chap09.textbook.exercise.p04;

public class NestedClassExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire(); //instance
 		Car.Engine engine = new Car.Engine(); //static
	}
}
