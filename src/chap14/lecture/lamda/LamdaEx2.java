package chap14.lecture.lamda;

public class LamdaEx2 {
	public static void main(String[] args) {
//		MyInterface o1 = () -> System.out.println("hello"); //메소드 한줄일 경우
		MyInterface o1 = () -> {
			System.out.println("hello");
			System.out.println("world");
		};
		
		MyInterface o2 = () -> {System.out.println("java");};
		MyInterface o3 = () -> System.out.println("java");
		
		o1.method();
		o2.method();
		o3.method();
		
	}
}
