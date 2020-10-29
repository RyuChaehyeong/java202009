package chap12.textbook.s120203;

public class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
		//ThreadA 생성 시 A라는 이름 set해줌
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName()+"");
		}
	} //ThreadA run 할 때 Name도 같이 붙여줌
}
