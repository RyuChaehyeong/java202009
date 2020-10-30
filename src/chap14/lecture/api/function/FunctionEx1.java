package chap14.lecture.api.function;

import java.util.function.Function;

public class FunctionEx1 {
	public static void main(String[] args) {
		Function<String, Integer> strToInt = s -> Integer.valueOf(s) * 2;
		int i = strToInt.apply("30");
		System.out.println(i);
		
		Function<Integer, String> IntToStr = x -> "값"+x;
		String str = IntToStr.apply(300);
		System.out.println(str);
	}
}
