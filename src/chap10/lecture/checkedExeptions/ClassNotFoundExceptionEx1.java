package chap10.lecture.checkedExeptions;

public class ClassNotFoundExceptionEx1 {
	public static void main(String[] args) {
		System.out.println("프로그램 실행1");
		try{
			System.out.println("프로그램 실행 try 1");
			Class.forName("java.lang.String2");
			// classNotFound Exception을 발생시키는 static method
			System.out.println("프로그램 실행 try 2");
		} catch (ClassNotFoundException e) {
			//Exception 발생시 실행되는 코드
			System.out.println("익셉션 발생!");
		} finally {
			System.out.println("무조건 실행!");
		}
		System.out.println("프로그램 실행2");
	}
}
