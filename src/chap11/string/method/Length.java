package chap11.string.method;

public class Length {
	public static void main(String[] args) {
		String str8 = "이것이 자바다!";
		int l = str8.length();
		System.out.println(l);
		
		//마지막 char가지고 오는 방법 (charAt와 length사용)
		char last = str8.charAt(l-1);
		System.out.println(last);
	}
}
