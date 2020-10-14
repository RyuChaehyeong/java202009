package chap06.lecture.accessModifier.other;

import chap06.lecture.accessModifier.MyClass;

public class MyApp {
	public static void main(String[] args) {
		MyClass c = new MyClass();
		System.out.println(c.var1_public);
//		System.out.println(c.var2_default);
		//default field는 다른 패키지에서 사용x
//		System.out.println(c.var3_private);
	}
}
