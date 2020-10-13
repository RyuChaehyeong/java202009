package chap06.lecture.field;

public class FieldEx01 {
	public static void main(String[] args) {
		//값에 대한 정보를 가지고 있는 것이 필드다!
		
		Car c1 = new Car();
		c1.name = "kia";
		c1.model = "k7";
		c1.price = 500;
		System.out.println("===c1===");
		System.out.println(c1.name);
		System.out.println(c1.model);
		System.out.println(c1.price);
		
		System.out.println();
		Car c2 = new Car();
		System.out.println("===c2 초기값 확인===");
		System.out.println(c2.name);
		System.out.println(c2.model);
		System.out.println(c2.price);
		
		System.out.println();
		System.out.println("===c2에 값넣음===");
		c2.name = "ford";
		c2.price = 700;
		System.out.println(c2.name);
		System.out.println(c2.
				price);
	}
}


















