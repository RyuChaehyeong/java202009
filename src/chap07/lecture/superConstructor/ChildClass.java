package chap07.lecture.superConstructor;

public class ChildClass extends parentClass{
	
	public ChildClass() {
		//super(); //자바가 알아서 super();로 상위클래스 생성자 호출 (부모클래스에 argument 없는 생성자인 경우)
		super(1); 
		//부모 클래스의 argument있는 생성자가 있는 경우에 명시적으로부모클래스의 생성자를 호출을 해줘야 함
	}; //argument없는 생성자
	@Override
	void method1() {
		super.method1();
		//super instance 언제 만드냐면
		System.out.println("child method1");
	}
}
