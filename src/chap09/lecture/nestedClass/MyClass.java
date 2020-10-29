package chap09.lecture.nestedClass;

public class MyClass {
	//Class1과 Class2는 멤버 클래스
	
	class Class1 {		
		int i;
//		static int j;
		//인스턴스 내부 클래스는 static 멤버 가질 수 없다.
		
		Class1(){}
		
		void method() {
			
		}
	} //Class1은 인스턴스 멤버 클래스
	
	static class Class2 {
		int i;
		//static 내부 클래스는 static 멤버를 가질 수 있다. 
		static int j;
		
		Class2(){}

		void method() {
			
		}
	} //Class는 static 멤버 클래스
}
