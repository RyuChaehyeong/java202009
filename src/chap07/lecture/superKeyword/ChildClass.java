package chap07.lecture.superKeyword;

public class ChildClass extends ParentClass{
	@Override
	void method1() {

		super.method1(); //super의 method1이 먼저 실행
		System.out.println("child method1");
		
		//super로 접근하면 상위클래스 실행
	}
}
