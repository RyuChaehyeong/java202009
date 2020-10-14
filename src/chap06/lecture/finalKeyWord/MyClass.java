package chap06.lecture.finalKeyWord;

public class MyClass {
	
	int field1;
	
	
	final int field2; 
	/*생성자에 작성된 코드가 젤 먼저 실행, 
	이때 생성자에서 파이널 키워드가 있는 필드에
	값을 꼭 할당해줘야 한다. */
	
	//(1) 필드 선언 시에 주는 방법
	final static int field3  = 20;
	
	
	final static int field4;
	static {
		field4 = 30;
	}
	//final static field는 값이 변하지 않아서 , 모든 인스턴스 또는 클래스를 사용하는 다른클래스에서 상수처럼 사용
	
	//(2) 생성자에서 주는 방법
	public MyClass() {
		field2 = 99; //한번 할당받음
	}
	
	//상수는 대문자로 작성하는 것이 관습. 
	//인티저의 최소INTEGER.MIN_VALUE, 최댓값INTEGER.MAX_VALUE, PI
		//static final int VARIABLE_NAME
}
