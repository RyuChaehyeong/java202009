package chap03.binary;

public class ConcatOperator {
	public static void main(String[] args) {
		//연결연산자 concatenate
		int a = 3;
		int b = 5;
		int c = a+b;
		
		String s = "9";
//		int d = a+s; //int type에는 못담고
		String d = a+s; //String type에는 담을 수 있음
		System.out.println(d);
		
		String e = a + b + s;
		System.out.println(e); //a+b먼저!
		
		String f = s+b+a;
		System.out.println(f); //s와 b연산, String이후에 
		//계속 string으로 연결연결
	}
}
