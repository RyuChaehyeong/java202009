package chap06.lecture.method.overloading;

public class MyClass {
	void method1() {
		System.out.println("method1....");
	}
	
	//같은 이름의 메소드를 만드는 오버라이딩
	//오버라이딩을 할 때는 파라미터의 타입or개수or순서가 달라야 한다.
	void method1(int i) {
		System.out.println("method1 int");
	}
	
	void method1(double j) {
		System.out.println("method double");
	}
	
	void method1 (int i, int j) {
		System.out.println("method1 int, int");
	}
	
	void method1 (double i, int j) {
		System.out.println("method1 double int");
	}
	
	void method1 (int i, double j) {
		System.out.println("method1 int double");
	}
	
//	int method1(double i, int j) {
//		System.out.println();
//		return 3;
//	}
	//리턴타입으로는 오버라이딩 못한다. only 파라미터!!
}
