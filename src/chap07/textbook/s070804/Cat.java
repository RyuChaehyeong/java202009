package chap07.textbook.s070804;

public class Cat extends Animal{
	
	public Cat() {
		this.kind = "포유류";
	}
	
	@Override //꼭 구현, 강제성
	public void sound() {
		System.out.println("애애용");
	}
	
}
