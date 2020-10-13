package chap06.lecture.thisKeyword;

public class MyClass {
	int var; //인스턴스 필드
	
	//기본생성자
	MyClass() {
		
	}
	//생성자2
	MyClass(int var) {
		this.var = var;
	}
	
	void method1() { //인스턴스 메소드
		int var = 5;
		System.out.println(this.var);
		System.out.println(var);
	}//this는 이 설계도를 통해 만들어지는 인스턴스 대체
	
	void method2() {
		this.method1();
	}//this. 앞으로 만들어지는 인스턴스의 참조변수를 대신,
	//	인스턴스 필드와 함께 사용
}
