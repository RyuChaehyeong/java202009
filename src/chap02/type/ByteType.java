package chap02.type;

public class ByteType {
	public static void main(String[] args) {
		// byte : 정수형 (-128 ~ 127)
		// 크기 : 1byte (8bit)
		//-128: 1000 0000
		// -3: 1111 1101
		// -2: 1111 1110
		// -1: 1111 1111
		// +1
		//    1 0000 0000 => 맨 앞에 1이 버려져서 0이됨
		// 0 : 0000 0000
		// 1 : 0000 0001
		// 2 : 0000 0010
		//127: 0111 1111
//		맨 앞에 비트가 1이면 음수, 0이면 0또는 양수
		
		//+1 : 1000 0000 => 음수로 -128	
		
		byte byteValue;
		byteValue = 0;
		System.out.println(byteValue);
		byteValue = 127;
		System.out.println(byteValue);
		
		byteValue++;
		System.out.println(byteValue);
//		byteValue = 128; 값이 들어갈 수 x
	}
}
