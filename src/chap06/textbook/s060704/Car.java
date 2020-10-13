package chap06.textbook.s060704;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	
	Car(){ 
		this.company = "현대자동차";
	}
	
	Car(String model){
		this.company = "현대자동차";
		this.model = model;
	}
	
	Car(String model, String color){
		this.company = "현대자동차";
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.company = "현대자동차";
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
