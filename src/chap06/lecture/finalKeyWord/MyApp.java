package chap06.lecture.finalKeyWord;

public class MyApp {
	public static void main(String[] args) {
		
	int i;
	final int j;
	i=30;
	i=40;
	
	j = 20;
//	j = 10; //compile error.
	
	//변수앞에 파이널, 딱 한번만 값을 할당 받을 수 있다.
	
	
	
	MyClass o1 = new MyClass();
	o1.field1 = 30;
//	o1.field2 = 30; //compile error.
	}
}
