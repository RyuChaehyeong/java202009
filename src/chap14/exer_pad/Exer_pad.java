package chap14.exer_pad;

public class Exer_pad {
	public static void main(String[] args) {
		final int i = 1;
		 
		MyInterface i1 = () -> System.out.println("실행");
		
		MyInterface i2 = new MyInterface() {
			//익명 로컬 클래스
			@Override
			public void method() {
				System.out.println("실행"+i);
			}
		
		};
		
//		i = 3;

	}
}	
