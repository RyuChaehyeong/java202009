package chap02.type;

public class LongType {
	public static void main(String[] args) {
		//long : 8byte (64bit)
		//최대: 9223372036854775807
		//최소: -9223372036854775808
		
		long longValue;
		longValue = 9223372036854775807L;//끝에 영문자L, long이라는 것을 명시
		System.out.println(longValue);
		
		longValue = 9_223_372_036_854_775_807L;
		longValue = -9223372036854775808L;
	}
}
