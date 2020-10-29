package chap08.textbook.exercise.p03;

public class SoundableExample {
	
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
	//printSound method의 parameter에 Cat 인스턴스와 Dog인스턴스를 넣을 수 
	//있는 이유는 둘다 Soundable interface를 구현하고 있기 때문이다. 
}
