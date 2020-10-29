package chap10.lecture.runtimeExceptions;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
		int[] a = null; //가리키는 인스턴스 없음
		System.out.println(a.length);
		
	}
}
