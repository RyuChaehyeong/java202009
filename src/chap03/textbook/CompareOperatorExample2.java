package chap03.textbook;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2==v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4==v5);//false
		//이진 포맷의 가수를 사용하는 모든 부동소수점 타입은 0.1을 정확히
		//표현할 수 없어서 0.1f는 0.1의 근사값으로 표현되어 
		//0.10000000149011612와 같은 값이 되기 때문에 0.1보다 큰 값이 되어버림
		System.out.println((float)v4==v5);//true
		System.out.println((int)(v4*10)==(int)(v5*10));//true
	}
}
