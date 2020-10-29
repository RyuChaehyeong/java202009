package chap13.lecture;

public class GenericEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		o1.method1();
		o1.method2(new Object());
		o1.method2("java");
		o1.method2(300);
		//타입 파라미터가 Object로 치환이 된다.
		
		
		//new 뒤 생성자에는 타입 파라미터 생략해도 됨 앞에 것에 의해 유추됨
		MyClass<String> o2 = new MyClass<String>();
		//이때 타입이 완성
		o1.method1();
		//o2의 설계도는 T가 String으로 치환되어 만들어짐
		o2.method2("java");
//		o2.method2(new Object()); //Object type불가
		
		MyClass<Integer> o3 = new MyClass<Integer>();
		o3.method2(100);
//		o3.method2("java"); //불가
	}
}
