package chap09.textbook.s090304;

public class Outter {
	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			//내부 클래스 필드에 접근: this.필드명
			System.out.println(this.field);
			this.method();
			
			//바깥클래스에 접근: 바깥클래스명.this.필드명
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
	
}
