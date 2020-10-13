package chap06.lecture.method;

public class MyAppReturn {
	public static void main(String[] args) {
		MyClassReturn o1 = new MyClassReturn();
		o1.method1();
		o1.var1 = 5;
		o1.method2();
		//리턴된 것이 눈에 보이는 것은 x
		//return: 메소드 종료, 오른쪽에 있는 값을 호출한 곳이로 돌려줌
		//o1.method2() 전체가 리턴값으로 치환
		int v = o1.method2();
		System.out.println(v);
	}
}
