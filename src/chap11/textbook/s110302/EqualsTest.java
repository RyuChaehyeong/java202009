package chap11.textbook.s110302;

public class EqualsTest {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		Object o2 = o1;
		Object o3 = o1;
		System.out.println(o2 == o3); //true
		System.out.println(o2.equals(o3)); //true
		// ==> Object class의 equals method는 비교 연산자인 ==
		//와 동일한 결과를 리턴한다. 
	
	}

}

class MyClass {
	
}
