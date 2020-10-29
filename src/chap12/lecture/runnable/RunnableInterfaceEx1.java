package chap12.lecture.runnable;

public class RunnableInterfaceEx1 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable1());
		//Thread 생성자 파라미터에 Run메소드 가지는 인스턴스를 넣어주면 됨
		Thread t2 = new Thread(new Runnable2());
		
		t1.start();
		t2.start();
	}
}
