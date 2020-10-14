package chap06.lecture.accessModifier;

public class MyApp {
	public static void main(String[] args) {
		MyClass c = new MyClass();
		System.out.println(c.var1_public);
		System.out.println(c.var2_default);
//		System.out.println(c.var3_private); 
		//private field는 같은 패키지여도 다른 클래스이면 사용x
	}
	
}
