package chap18.textbook.s180504;

public class VarArgEx1 {
	public static void main(String[] args) {
		method();
		method(1);
		method(1,4);
	}
	
	public static void method(int... nums) {
		//...은 파라미터 0개 이상
		System.out.println("method 실행");
		System.out.println(nums.length);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		//nums는 배열이 된다.
	}
}
