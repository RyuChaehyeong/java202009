package chap11.object.equals;

public class EqualsEx1 {
	public static void main(String[] args) {
		
	Book b1 = new Book(963);
	Book b2 = new Book(963);
	
	System.out.println(b1==b2);
	System.out.println(b1.hashCode());
	System.out.println(b2.hashCode());
	System.out.println(b1.equals(b2));
	
//	바코드는 같은데 서로 다른 책, 참조값 다름
//	서로다른 책이지만 equals method는 같게 하고 싶음
//	equlas method를 재정의하기 전에 hashCode를 재정의
	
	System.out.println("-----------------------------");
	String s1 = "java";
	String s2 = new String("java");
	//equals가 같을려면 hashCode가 같아야 함
	//실제로는 다른객체 
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s1.equals(s2));
	}
}
