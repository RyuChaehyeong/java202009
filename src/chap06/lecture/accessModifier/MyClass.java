package chap06.lecture.accessModifier;

public class MyClass {
	//접근제한자
	//public, protected, private, (default == package private)
	
	public int var1_public;
	int var2_default;
	private int var3_private;
	
	void method1() {
		System.out.println(var1_public);
		System.out.println(var2_default);
		System.out.println(var3_private); //같은 클래스 내 private field 사용가능
	}
}
