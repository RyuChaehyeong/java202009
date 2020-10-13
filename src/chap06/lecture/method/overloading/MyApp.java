package chap06.lecture.method.overloading;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		o1.method1();
		o1.method1(7);
		o1.method1(2.2);
		o1.method1(5, 6);
		o1.method1(2.2, 8);
		o1.method1(5, 4.5);
	}
}
