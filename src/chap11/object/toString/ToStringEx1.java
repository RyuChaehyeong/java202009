package chap11.object.toString;

public class ToStringEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		String s = o1.toString();
		System.out.println(s); 
		//결과: chap11.object.toString.MyClass@15db9742
		
		
		MyClass o2 = new MyClass();
		String s2 = o2.toString();
		System.out.println(s2);
		//결과: chap11.object.toString.MyClass@6d06d69c
		
		
		System.out.println(s2.toString());
		System.out.println(s2); //syso에 객체가 들어가면 자동으로 toString 호출 결과와 같다.
	}
}
