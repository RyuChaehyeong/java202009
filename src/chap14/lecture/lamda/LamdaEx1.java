package chap14.lecture.lamda;


public class LamdaEx1{
	public static void main(String[] args) {
		// 추상 메소드가 하나인 인터페이스의 객체를 만들 때
		// 람다식은 메소드 본체만 작성
		
		MyInterface o1 = new MyInterface() {
			//하나뿐인 추상메소드(이미 MyInterface에 signature있음, 제거 해도댐)
			@Override
			public void method() {
				System.out.println("추상 메소드 재정의");
			}
		};
		
		MyInterface o2 = () -> System.out.println("추상메소드 재정의2");
		//method()라고 안써있지만 method임.
		// = (파라미터)  ->   override 할 body contents

		o1.method();
		o2.method();
		
		
	}
}
