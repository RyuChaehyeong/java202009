package chap03.textbook;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x*y;
		System.out.println(z);
		/*z가 10^12가 되어 int 타입에 
		저장될 수 있는 값으 범위를 초과하여
		쓰레기값을 얻게 되었다.
		*/
	}
}
