package chap12.textbook.s120203;

public class ThreadB extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	//이름 set은 안해주고 get만 해줄경우 0부터 순차적으로 이름이 붙는다. 
	}
}
