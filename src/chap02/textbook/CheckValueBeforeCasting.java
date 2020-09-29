package chap02.textbook;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;
		
		if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
			System.out.println("byte타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요");
		}else {
			byte b = (byte) i;
			System.out.println(b);
			// 어떤 정수값과 실수값을 다른 타입으로 변환하고자 할 때는
			// 변환될 타입의 최소값과 최대값을 벗어나는지 반드시 검사하고
			// 벗어난다면 타입 변환을 하지 말아야 한다. 
		}
	}
}
