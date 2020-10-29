package chap10.textbook.s100402;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+"+ data2+"="+result);
		} catch(ArrayIndexOutOfBoundsException e) { 
			//ArrayIndexOutOfBoundsException는 Exception의 SubClass
			//---@@주의@@--- 상위 클래스 잡는 캐치 블록이 아래에 있어야 함 
			//(왜냐면 상위클래스에서 먼저 잡으면 하위클래스 예외 코드는 쓸데없는 코드가 됨)
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (Exception e) { //얘가 아래에
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요");
		}
		
	}
}
