package chap07.lecture.casting;

public class MyApp {
	public static void main(String[] args) {
		SuperClass o1 = new SubClass();
		
		o1.method1();
		//o1.method2(); 컴파일 에러 (o1은 SuperClass type이라 method1밖에 못씀.)
		//o2도 사용하고 싶어서 SuperClass인 o1을 casting하여 SubClass type의 o2에 저장
		
		SubClass o2 = (SubClass)o1; //Casting (o1이 실제 SubClass 인스턴스여서 가능)
		o2.method1();
		o2.method2(); //사용가능!
	}

}
