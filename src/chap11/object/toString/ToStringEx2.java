package chap11.object.toString;

public class ToStringEx2 {
	public static void main(String[] args) {
		
	MyClass o1 = new MyClass();
	o1.setFields(30, "hong", "123");
	
	MyClass o2 = new MyClass();
	o2.setFields(20, "kim","321");
	
	System.out.println(o1); //MyClass [age=30, name=hong, password=123]
	System.out.println(o2); //MyClass [age=20, name=kim, password=321]

	
	}
}
