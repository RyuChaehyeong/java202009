package chap05.lecture.enumType;

public class EnumTypeEx2 {
	public static void main(String[] args) {
		
		///****Enum Type에 있는 기본 정의 메소드 ****///
		MyEnum e1 = MyEnum.MY_VALUE4;
		System.out.println(e1.name()); //MY_VALUE4
		
		System.out.println(e1.ordinal());//3
		
		MyEnum e2  =  MyEnum.valueOf("VALUE3");
		System.out.println(e2.name()); //VALUE3
		
		int diff = e1.compareTo(e2);
		System.out.println(diff); //1 (means e1이 e2보다 하나 뒤에있다.)
		
		MyEnum[] arr = MyEnum.values();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(", ");
		};
		
	}
}
S