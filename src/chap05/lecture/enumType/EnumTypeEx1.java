package chap05.lecture.enumType;

public class EnumTypeEx1 {
	public static void main(String[] args) {
		//new연산자로 인스턴스 생성x, 정의해놓은 값을 가져옴
		MyEnum e2 = MyEnum.MY_VALUE4;
		MyEnum e3 = MyEnum.MY_VALUE4;
		
		
		
		System.out.println(e2 == e3);
		//결과: true (상수로 취급)
		
	
		MyEnum e1 = MyEnum.VALUE1;
		System.out.println(e1 instanceof Object); //Enum은 Object의 하위 클래스
		System.out.println(e1 instanceof Enum); //MyEnum은 Enum의 하위 클래스
		System.out.println(e1.toString()); //Enum에서 Override한 toString 메소드 사용
		//MyEnum 에서는 toString 재정의 안했기 때문이다

	}
}

class MyClass {
	
}
