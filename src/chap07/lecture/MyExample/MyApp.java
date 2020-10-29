package chap07.lecture.MyExample;

public class MyApp {
	public static void main(String[] args) {
		Parent parent = new Child(); //parent는 Parent type의 Child 객체
		
		
		parent.method1(); // (결과) Child method1입니다.
//		parent.method2(); //호출 불가 (Parent type이어서)
		
		
		//나는 method2를 사용하고 싶다. => Casting
		Child child = (Child) parent; //Parent type이었던 Child의 객체를 
								      //Child type의 child 참조변수에 담음
									  // parent는 Child의 실제 인스턴스여서 가능
		
		
		child.method2(); //child는 Child type이니까 method2 사용가능
		child.method1(); 
	}
}
