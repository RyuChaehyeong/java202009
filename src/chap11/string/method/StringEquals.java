package chap11.string.method;

public class StringEquals {
	public static void main(String[] args) {
		String str2 = "python";
		String str3 = "python";
		System.out.println(str2 == str3);//true
		
		String str4 = "py";
		String str5 = "thon";
		String str6 = str4 + str5;
		
		System.out.println(str2);
		System.out.println(str6);
		System.out.println(str2==str6);//false
		System.out.println(str2.equals(str6));//true
	}
}
