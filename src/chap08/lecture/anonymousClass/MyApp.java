package chap08.lecture.anonymousClass;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		o1.method1();
		
		//인터페이스 이름으로 구현 클래스 이름이 없음 
		MyInterface o2 = new MyInterface() {

			@Override
			public void method1() {
				System.out.println("anonymous class method1");
			}
			
		};
		o2.method1();
	}
}
