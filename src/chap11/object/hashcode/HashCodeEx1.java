package chap11.object.hashcode;

public class HashCodeEx1 {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1);
		System.out.println(o2);
		
		//참조값만 얻어내고 싶을 때 쓰는 메소드가 hasdCode();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		
		//해시코드도 재정의하는데 사용
		
		System.out.println("===============================");
		//String은 해시코드 재정의 함
		String s1 = "java";
		String s2 = new String("java");
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		//String 에서는 문자열을 가지고 계산한 해시코드를 리턴
		//진짜 참조값 리턴x
		
	}
}
