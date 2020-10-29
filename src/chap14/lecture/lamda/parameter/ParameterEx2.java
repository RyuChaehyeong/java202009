package chap14.lecture.lamda.parameter;

public class ParameterEx2 {
	public static void main(String[] args) {
		
		MyInterface2 o1 = (int a, int b) -> System.out.println(a+b);
		o1.method(3, 10);
		
		//파라미터 두개일때도 타입 생략 가능
		MyInterface2 o2 = (x, y) -> System.out.println(x+y);
		o2.method(15, 5);
		
		//파라미터 두 개일때는 둥근괄호 생략x
		
	}
	
}
