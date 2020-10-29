package chap13.lecture;

public class MyClass2<T extends Number> {
	//Number의 하위클래스만 T에 들어갈 수 있다. 
	//Number가 가지는 메소드는 안전하게 실행가능
	void method1(T t) {
		System.out.println(t.doubleValue());
	}
}
