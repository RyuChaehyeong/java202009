package chap11.lecture.wrapper;

public class WrapperEx1 {
	public static void main(String[] args) {
		//byte, short, int, long
		//float, double, char, boolean
		
		//Byte, Short, Integer, Long
		//Float, Double, Char, Boolean
		//8개 기본 타입을 참조타입처럼 쓰고싶었음

		int j = 2;
		method1(j); //auto-boxing (자동으로 Wrapping이 일어남)
		
		int i = 1;
		
		Integer in = Integer.valueOf(i);
		//기본타입인 것을 참조타입으로 감싸서 만듦. in은 참조타입이니까 상위클래스로 Object 항상
		
		method1(i); //기본 타입은 Object type으로 할당x
		//15번 줄 없을 때 이면에는 어떤일이..?
	}
		public static void method1(Object o) {
			System.out.println(o);
			//8개 기본타입과 참조타입 간에 박싱과 언박싱이 자동으로 일어나도록 함
			
	}
		Integer in2 = 3; //자동!
		int m = in2;
}
