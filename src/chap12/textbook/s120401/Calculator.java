package chap12.textbook.s120401;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		synchronized (this) {
			//객체 참조를 획득하는 스레드만 잡을 수 있게 (this 자체를 lock으로 사용)
			this.memory = memory;			
		}
		//1. 값을 세팅
		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			//2. 읽는것까지
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}

	}

}
