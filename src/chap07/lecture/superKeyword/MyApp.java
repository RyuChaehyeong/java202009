package chap07.lecture.superKeyword;

public class MyApp {
	public static void main(String[] args) {
		ChildClass o1 = new ChildClass();
		
		o1.method1();
		/*
		 *  결과
		 *  parent method1
			child method1
		 */
	}
}
