package chap05.referenceType;

public class ReferenceType4 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java"); //새로운 인스턴스 생성
		
		System.out.println(str1==str2); //참조값을 비교
		System.out.println(str1==str3); //참조값을 비교
		
		System.out.println(str1.equals(str3)); //인스턴스가 가지는 문자열 비교
	}
}
