package chap07.textbook.s070701;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2(); //Child-method2() 실제 인스턴스의 메소드 실행
//		parent.method3();//호출불가
	}
}
