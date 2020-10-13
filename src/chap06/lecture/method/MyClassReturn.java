package chap06.lecture.method;

public class MyClassReturn {
	int var1;
	void method1() {
		System.out.println("메소드1 실행");
	}
	
	int method2() {
		System.out.println("메소드2 실행");
		//return이 작성되어야 할때는 메소드명 앞에 리턴타입 명시, 안하면 컴파일 에러
		return var1*2;
		//statement사용xx, return에서 메소드 종료!
		
	}
}
