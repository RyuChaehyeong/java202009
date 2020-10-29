package chap07.textbook.s070804;

public class Dog extends Animal {

	public Dog() {
		this.kind = "포유류";
	}
	
	@Override //꼭 구현, 강제성
	public void sound() {
		System.out.println("멈머");
	}

}
