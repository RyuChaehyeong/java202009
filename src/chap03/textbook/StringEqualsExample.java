package chap03.textbook;

public class StringEqualsExample {
	public static void main(String[] args) {
		//리터럴 값이니까 원래 있는 값을 재사용
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		
		String strVar3 = new String("신민철");
		//리터럴 값이 아닌 새롭게 만들어낸 string
		
		
		//참조값을 비교
		System.out.println(strVar1==strVar2);
		System.out.println(strVar1==strVar3);
		System.out.println("====");
		
		
		//실제 가지고 있는 string 값을 비교
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}
}

