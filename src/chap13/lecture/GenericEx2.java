package chap13.lecture;

public class GenericEx2 {
	public static void main(String[] args) {
		MyClass2<Number> o1 = new MyClass2<Number>();
		
		//Number의 하위클래스 가능
		MyClass2<Integer> o2 = new MyClass2<Integer>();
		
		//Number의 상위클래스는x
//		MyClass2<Object> o3 = new MyClass2<Object>();
	}
}
