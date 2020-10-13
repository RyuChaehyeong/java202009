package chap06.textbook.s060705;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		
	}
	
	Car(String model) {
		this(model, "은색", 250);
		//다른 생성자를 호출 (String, String, int인 생성자를 호출)
	}
	
	Car(String model, String color) {
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
//this( )는 다른 생성자 호출, this.은 필드 지칭
