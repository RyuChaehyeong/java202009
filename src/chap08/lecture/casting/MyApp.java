package chap08.lecture.casting;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		MyInterface i1 = o1; //자동형변환
		i1.method1();
		//i1.method2(); //타입이 MyInterface라.. 못씀
		
		
		if(i1 instanceof MyClass) {
			MyClass o2 = (MyClass) i1;			
			o2.method2();
		}
		
		System.out.println(i1 instanceof MyInterface);
	}
}
