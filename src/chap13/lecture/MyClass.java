package chap13.lecture;

public class MyClass<T> {
	public void method1() {
		System.out.println("method1");
	}
	
	public void method2(T s) {
		System.out.println(s);
		//T를 클래스 안에서 마음대로 쓸 수 있다.
		//아직 타입 결정 x
		
	}
}
