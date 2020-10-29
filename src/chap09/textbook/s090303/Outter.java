package chap09.textbook.s090303;

public class Outter {
	//자바 7이전
	public void method1(final int arg) {
		final int localVariable = 1;
//		arg = 100;
//		localVariable = 100;
		//파이널이니까 값 할당x
		
		class inner {
			public void method() {
				int result = arg + localVariable;
				//final이니까 잘 씀
			}
		}
	}
	
	//자바 8이후
	public void method2(int arg) {
		int localVariable = 1;
//		arg = 100;
//		localVariable = 100;
		
		class inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
