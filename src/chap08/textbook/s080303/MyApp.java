package chap08.textbook.s080303;

import chap08.textbook.s080201.RemoteControl;

public class MyApp {
	public static void main(String[] args) {
		SmartTelevision o1 = new SmartTelevision();
		RemoteControl r1 = o1;
		Searchable s1  = o1;
		
		s1.search("daum");
//		s1.turnOn();
//		s1.turnOff();
		
		r1.turnOff();
		r1.turnOn();
		r1.setVolume(10);
//		r1.search("google");
		
		//r1도 smartTelevision instance, s1도 smartTelevision
		System.out.println(r1 instanceof RemoteControl); //true
		System.out.println(r1 instanceof Searchable); 
		//true , r1의 타입이 RemoteControl이라도 실제 인스턴스가 SmartTelevision
		System.out.println(s1 instanceof RemoteControl); //true
		//true , s1의 타입이 Searchable이라도 실제 인스턴스가 SmartTelevision
		
	}
}
