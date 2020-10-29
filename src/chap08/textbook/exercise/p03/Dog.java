package chap08.textbook.exercise.p03;

public class Dog implements Soundable{

	@Override //Soundable interface의 sound method override
	public String sound() {
		return "멈멈";
	}

}
