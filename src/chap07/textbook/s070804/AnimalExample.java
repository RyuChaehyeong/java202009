package chap07.textbook.s070804;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("=======");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound(); //animal type으로 변환해도 sound method가 있다는 것이 보장, 실제 인스턴스으 메소드 실행
						//하위클래스에 있는 것은 항상 상위클래스에도 있다
		animal = new Cat();
		animal.sound();
		System.out.println("=======");
		
		//메소드 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
		//메소드
		public static void animalSound(Animal animal) {
			animal.sound();
		}
}
