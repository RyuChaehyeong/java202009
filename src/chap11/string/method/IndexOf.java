package chap11.string.method;

public class IndexOf {
	public static void main(String[] args) {
		String str7 = "자바 프로그래밍";
		int a = str7.indexOf("자바로");
		System.out.println(a);
		//없으면 -1이 리턴
		//찾는 단어의 맨 첫번째 글자의 index를 return
		
	}
}
