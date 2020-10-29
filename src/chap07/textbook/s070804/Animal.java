package chap07.textbook.s070804;

public abstract class Animal {
	public String kind;
	
	public void breather() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound(); //추상메소드 구현x
}
