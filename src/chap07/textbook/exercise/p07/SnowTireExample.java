package chap07.textbook.exercise.p07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		System.out.println(tire == snowTire);//true
		//변수명은 달라도 같은 인스턴스 가리킴
		
		
		snowTire.run();
		tire.run();
	}
}
