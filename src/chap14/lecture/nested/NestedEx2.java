package chap14.lecture.nested;

public class NestedEx2 {
	
	private int outterField;
	
	 public void method() {
		 MyInterface i1 = () -> {
			 
			 int outterField = 3;
			 System.out.println("익명 클래스의 객체 (local class)");
			 System.out.println(outterField); //메소드내 변수
			 System.out.println(this.outterField); //
			 System.out.println(NestedEx2.this.outterField); //외부클래스 필드
			 //바깥 필드 사용하려면 앞에 클래스명을 써야 함
			 
		 };
	 }
	
	public static void main(String[] args) {
		
	}
}
