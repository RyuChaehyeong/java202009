package chap14.lecture.returnKeyword;

public class ReturnEx1 {
	public static void main(String[] args) {

		MyInterface o1 = (x) -> {
			int y = x * 2;
			return y;
		};
		
		o1.method(3);
		
		MyInterface o2 = x -> {return x*2;}; 
		//리턴키워드는 statement가 하나라도 중괄호가 있어야 함.
		o2.method(10);
		
		
		MyInterface o3 = a -> a*2;
		//리턴키워드 생략하면 중괄호도 생략 가능
		o3.method(20);
	}
}
