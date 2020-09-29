package chap02.textbook;

public class FloatDoubleExample {
	public static void main(String[] args) {
		double var1 = 3.14;
		float var2 = 3.14F;
		
		double var4 = 0.1234567890123456789;
//		var4: 0.12345678901234568 --> 컴파일 결과
		float var5 = 0.1234567890123456789F;
//		var5: 0.12345679 ---> 좁은 범위 수를 덜 촘촘하게 저장, 짤림
		
		System.out.println("var1: "+var1);
		System.out.println("var2: "+var2);
		System.out.println("var4: "+var4);
		System.out.println("var4: "+var4);
		System.out.println("var5: "+var5);
		
		int var6=3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		System.out.println("var6: "+var6);
		System.out.println("var7: "+var7);
		System.out.println("var8: "+var8);
		System.out.println("var9: "+var9);
	}
}
