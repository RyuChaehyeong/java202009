package chap06.textbook.s061303.package2;

import chap06.textbook.s061303.package1.A;
import chap06.textbook.s061303.package1.B;

public class C {
	public C () {
		A a = new A();
		//A는 public class이므로 import시킨 후에는 외부 패키지에서도 사용가능
		a.field1 = 1;
		//a.field2 = 1;
		//a.field3 = 1;
		
		a.method1();
		//a.method2();
		//a.method3();
	}
}