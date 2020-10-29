package chap09.textbook.s090302;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	//인스턴스 클래스 안에서는 바깥 클래스의 모든 멤버에 접근 가능
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	//static class안에서는 인스턴스 필드와 메소드에 접근 x
	static class C {
		void method() {
			//field1 = 10;
			//method1();
			//인스턴스 필드와 메소드는 접근할 수 없다. 
			field2 = 10;
			method2();
		}
	}
}
