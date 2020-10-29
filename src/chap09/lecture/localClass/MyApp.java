package chap09.lecture.localClass;

public class MyApp {
	public static void main(String[] args) {
		int i = 3;
		System.out.println(i); //지역변수 (메소드 안쪽에서만 쓰임)
		
		class LocalClass {
			int i;
			
//		static int j; static 작성 못함
			void method() {}
//			static void method2() {}
		}
		
		LocalClass l1 = new LocalClass();
		//안에서만 쓸 수 있음.
		
	}
}
