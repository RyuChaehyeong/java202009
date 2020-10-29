package chap08.lecture.interfaceKeyword;

public class Malamute extends KindaDog implements Pet{

	@Override
	public void bark() {
		System.out.println("멍멍");
	}

	@Override
	public void sit() {
		System.out.println("말라뮤트 앉아!");
	}

}
