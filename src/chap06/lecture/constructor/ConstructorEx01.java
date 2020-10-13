package chap06.lecture.constructor;

public class ConstructorEx01 {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		//new: 연산자
		//Car(): 생성자
		//새로운 인스턴스가 만들어지고(메모리에 올라감)
		// +생성자에 있는 코드가 실행
		
		System.out.println(car1.name);
		System.out.println(car1.price);
		System.out.println(car2.name);
		System.out.println(car2.price);
		
		Car car3 = new Car("Volvo");
		Car car4 = new Car("Benz");
		System.out.println(car3.name);
		System.out.println(car4.name);
		
		System.out.println(car3.price);
		System.out.println(car4.price);
		
		Car car5 = new Car("Audi", 700);
		System.out.println(car5.name);
		System.out.println(car5.price);
		
		Car car6 = new Car("samsung",800);
		System.out.println(car6.name);
		System.out.println(car6.price);
	}
	
}

//생성자는 인스턴스가 만들어질때 실행되어야 하는코드= 주로 필드를 초기화 하는 코드
//파라미터를 개수를 정의하여 서로 다른 생성자를 만들어낼 수 있다. 






























