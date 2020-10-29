package chap12.lecture.threadClass;

public class ThreadClassEx2 {
	public static void main(String[] args) {
		//메인메소드의 실행 흐름도 스레드
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		
		//start method는 자바 가상머신이 적절하게 run method를 실행시켜줌
		
		t1.start();
		t2.start();
		
		
		//메인메소드 먼저
		for (int i = 0; i < 5; i++) {
			System.out.println((char) +('Z'-i));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}
		
	}
}
