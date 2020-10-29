package chap09.lecture.thisKeyword;

public class MyClass {
	int field1;
	class Nested {
		int field1;
		void method() {
			int field1 = 3;
			System.out.println(field1); //메소드내 변수
			System.out.println(this.field1); //내부 클래스 필드
			System.out.println(MyClass.this.field1); //외부클래스 필드
		}
	}
}
