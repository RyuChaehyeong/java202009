package chap11.string.method;

public class charAt {
	public static void main(String[] args) {
		String str1 = "java"; //str1은 객체
		
//		charAt(int index)
//		Returns the char value at the specified index.
		char c1 = str1.charAt(0);
		System.out.println(c1);
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
	}
}
