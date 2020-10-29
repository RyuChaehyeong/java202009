package chap12.lecture.concurrency;

public class ConcurrencyEx3 {
	
		static int field = 0;
		//lock == mutex
		
		static final Object  lock = new Object();
		//계주 바톤, 객체를 먼저 획득해야 statement 실행할 수 있음
		
		
		public  static void inc() {
			synchronized (lock) {
				field++;
			}
			
		}
		//메소드의 일부 statement만 순서대로 실행하게 하고 싶은 것
		public static void main(String[] args) {
			Thread t1 = new Thread() {
				public void run() {
					for (int i = 0; i < 100_0000; i++) {
//						field++;
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
//						field++;
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
