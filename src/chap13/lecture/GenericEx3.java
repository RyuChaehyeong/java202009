package chap13.lecture;

public class GenericEx3 {
	//타입파라미터를 메소드에 작성할 수도 있다 (제네릭 메소드)

	public static void main(String[] args) {
		GenericEx3.<String> method("java"); 
		method("hello"); //파라미터로 T를 유추할 수 있으면 생략가능
		method(3);
		String s = method2(); //리턴 타입으로 타입파라미터를 String으로 유추
		Integer i = method2(); //타입파라미터를 Integer로 유추
	}
	
	public static <T> T method2() {
		return null;
	}
	
	//메소드 호출 시 타입이 결정
	public static <T> void method(T t) {
		System.out.println(t);
	}




}
