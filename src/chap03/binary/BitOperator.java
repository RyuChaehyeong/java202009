package chap03.binary;

public class BitOperator {
	public static void main(String[] args) {
		
		//~ 반전 (단항)
		int i=10;
		int j = ~i;
		System.out.println(j); //-11
		
		//이항연산자 (피연산자가 integer, 결과도 integer)
			//& and : 같은 자리 bit가 1인 경우만 1, 나머지 0
			//| or :  같은 자리의 bit가 0안 경우만 0, 나머지 1
			//^ xor : 같은 자리의 bit가 다를 경우 1, 같으면 0
		
		int a = 45;
		int b = 25;
		int c = a&b;
		System.out.println(c); //9
		int d = a|b;
		System.out.println(d); //61
		int e = a^b;
		System.out.println(e); //52
		
		
		//bit shift 연산자
		// << : 비트를 왼쪽으로 옮김, 오른쪽은 영으로 채움, 맨 앞 영은 버려짐
		// >> : 비트를 오른쪽으로 옮김, 왼쪽은 msb (Most significant Bit) 최상위 비트로 채움
				//음수나 0은 1로, 양수는 0으로
		// >>> : 각 bit를 오른쪽으로 옮김, 왼쪽은 무적권 0으로 채움
		
		int val = 1; //
		int res = val << 1 ;
		System.out.println(res);
//		왼쪽으로 시프트 하나 x2
		
		val = 16;
		res = val >> 1;
		System.out.println(res);
//		오른쪽으로 시프트 하나 x1/2
		
		val = -17;
		res = val >> 1;
		System.out.println(res);
		
		val = 98;
		res = val >>> 2;
		System.out.println(res);
		//양수 일때는 어차피 왼쪽이 0이어서 같은 음수일때 다름
		
		val = -17;
		res = val >>> 1;
		System.out.println(res);
		
	}
}
