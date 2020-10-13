package chap11.textbook;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 객체지향 언어입니다. \n자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println("===========교체 전================");
		System.out.println(oldStr);
		
		System.out.println("===========교체 후================");
		System.out.println(newStr);
	}
}
