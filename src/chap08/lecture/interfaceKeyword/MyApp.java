package chap08.lecture.interfaceKeyword;

public class MyApp {
	public static void main(String[] args) {
		KindaCat c1 = new Cat();
		KindaCat c2 = new Tiger();
		
		KindaDog d1 = new Malamute();
		KindaDog d2 = new Wolf();
		
		c1.cry();
		c2.cry();
		
		d1.bark();
		d2.bark();
				
		Pet p1 = new Cat();
		Pet p2 = new Malamute();
		
		p1.sit();
		p2.sit();
		Cat cat = (Cat)p1; 
		Malamute mal1 = (Malamute) p2;
		
		//c1.sit();
		//d1.sit();
		//***c1.이랑, d1은 sit없다.
		//Pet type으로 형변환된 Cat객체와 Pet type의 Malamute객체만 sit을 가짐
		
		
		
		System.out.println(p1 instanceof Cat);
		System.out.println(p1 instanceof KindaCat);
		System.out.println(p1 instanceof Pet);
	}
	
}
