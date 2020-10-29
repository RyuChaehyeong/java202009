package chap10.textbook.s100202;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		if (args.length>=2) {
		String data1 = args[0];
		String data2 = args[1];
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
		}
		System.out.println("프로그램 종료");
	}
	//재생버튼 > Run configuration > argument로 args에 값넣음
}
