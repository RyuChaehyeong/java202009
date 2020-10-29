package chap12.lecture.concurrency;

public class ConcurrencyEx1 {
	//동시에 실행하여 발생하는 문제
	static int field = 0;
	
	
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
					field++;
				}
				System.out.println(getName()+"종료");
				System.out.println(field);
			};
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
					field++;
				}
				System.out.println(getName()+"종료");
				System.out.println(field);
			};
		};
		t1.start();
		t2.start();
		
		//CPU가 메모리를 읽어서 더한 다음에 메모리에 저장
		//스레드가 공유하는 값이나 객체는 안전하지 않은 문제가 생길 수 있다.
		//공유하는 객체가 일관성이 보장된다고 볼수 없음
		//해결방법>> 많음 값을 공유하지 않는 거시 최선이다. 
		
		
		
	}
}
