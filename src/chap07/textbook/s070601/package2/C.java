package chap07.textbook.s070601.package2;

import chap07.textbook.s070601.package1.A;

public class C {
	public void method() {
		A a = new A();
		//A의 생성자에 접근할 수 없다.
		a.field = "value";
		a.method();
	}
}
