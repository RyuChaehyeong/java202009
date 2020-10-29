package chap06.lecture.staticKeyword;

public class Class {
	//인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	//정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	//정적 블록 : 선언과 동시에 필드 초기화 안한 경우 여기서 초기화
	static {
		//field1 = 10; 
		field2 = 10;
		//method1();
		method2();
		//field1과 method1()은 인스턴스 멤버이기 때문에 static에서 호출x
	}
	
	//정적 메소드
	static void method3() {
		Class o1 = new Class();
		o1.field1 = 10;
		o1.method1();
		//객체를 먼저 생성하고 참조변수로 접근 (static block에서도 마찬가지)
		field2 = 10;
		method2();
		
	}
	
	
}
