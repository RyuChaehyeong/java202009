package chap07.lecture.instanceofOperator;

public class MyApp {
	public static void main(String[] args) {
		SuperClass o1 = new SubClass();
		//타입변환에 실수를 할 수 있다. (비정상 종료) => instanceof 연산자 사용
		//instanceof : 좌변이 참조변수, 우변이 타입
		//결과: boolean
		System.out.println(o1 instanceof SubClass); //true
		System.out.println(o1 instanceof SubClass2); //false
		
		if(o1 instanceof SubClass) {
			SubClass o2 = (SubClass) o1;
		}
		if(o1 instanceof SubClass2) {			
			SubClass2 o3 = (SubClass2) o1; //안전하게 실행 안됨!
		}
		
	}
}
