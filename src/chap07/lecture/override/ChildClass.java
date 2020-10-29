package chap07.lecture.override;

public class ChildClass extends ParentClass {
	
	//리턴타입 메소드명 파라미터 같고 코드블럭 안에만 변경
	@Override //컴파일에게 힌트를 주는 주석
	void method1() {
		System.out.println("child method1!!!!!메소드 오버라이딩");
	}
	
	
	void method2() {
		System.out.println("child class");
	}
}
