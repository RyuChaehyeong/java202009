package chap07.textbook.s070705;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
//		parent.fiedl2 = "data2"; (불가)
		parent.method1();
		parent.method2();
		//parent.method3(); (불가)
		
		//parent는 Parent type이라 Child class member인 field2와 method3를 사용 x
		
		Child child = (Child) parent;
		//parent를 Child class type으로 Casting하고 Child type의 child 참조변수에 넣음
		//field2와 method3 사용가능
		child.field2 = "yyy";
		child.method3();
		
	}
}
