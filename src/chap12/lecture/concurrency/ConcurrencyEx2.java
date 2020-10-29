package chap12.lecture.concurrency;

public class ConcurrencyEx2 {
static int field = 0;
	
	public synchronized static void inc() {
		field++;
		//한스레드가 이 메소드에 접근하고 있으면 다른 스레드가 접근 못하도록 하는 것
		//먼저 점유한 스레드가 다 완료하면 다음 스레드가
	}
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
//					field++;
					inc();
				}
				System.out.println(getName()+"종료");
				System.out.println(field);
			};
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
//					field++;
					inc();
				}
				System.out.println(getName()+"종료");
				System.out.println(field);
			};
		};
		t1.start();
		t2.start();
		
	}
}
