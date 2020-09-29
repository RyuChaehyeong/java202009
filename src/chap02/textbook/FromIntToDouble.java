package chap02.textbook;

public class FromIntToDouble {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		
		System.out.println("num2 형변환 전");
		System.out.println(num2);
		
		System.out.println("문제해결!!!!");
		double num3 = num2;
		System.out.println("num2 자동 형변환 후");
		
		
		num2 = (int)num3;
		System.out.println(num2);
		
		int result = num1 - num2;
		System.out.println(result);
	}
}