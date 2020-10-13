package chap03.binary;

public class DivideByZero {
	public static void main(String[] args) {
//		int x = 5;
//		int y = 0;
//		
//		int z = x/y;
//		int z= x%y; 영으로 나눌 수 가 없으니까 나머지를 구할 수 x
		System.out.println("어떤 실행문..");
		//정수 영으로 나누면 실행x, 바로 종료가 된다.
		
		
		double a = 5.0;
		double b = 0.0;
		
		double c = a/b;
		System.out.println(c);
		//결과가 Infinity라는 키워드로 나옴 
		//a또는 b값이 음수면 -Infinity로 나옴
		
		double d = a%b;
		System.out.println(d);
		//Not a Number 0으로 나눈 나머지는 없는 수 이다.
	}
}
