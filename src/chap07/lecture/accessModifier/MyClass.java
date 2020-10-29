package chap07.lecture.accessModifier;

public class MyClass {

	//protected : 다른 패키지에 있는 상속받은 클래스에서 접근가능
	//default: 다른 패키지에서 접근 x, 상속받은 클래스도x
	public int publicVar;
	protected int protectedVar;
	int defaultVar;
	
}
