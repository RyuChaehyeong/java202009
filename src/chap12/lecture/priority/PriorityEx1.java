package chap12.lecture.priority;

import chap07.lecture.polymorphism.sample.FireGun;

public class PriorityEx1 {
	public static void main(String[] args) {
		Thread[] threads = new Thread[20];
		//20개의 스레드가 같은 우선순위를 가지고 있음
		//우선순위를 높게 주면 CPU점유를 먼저함
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread() {
				public void run() {
					for (int i = 0; i<20_0000_0000; i++) {
					}
					System.out.println(getName()+" 완료");
				};
			};
			if(i > 10) {
				threads[i].setPriority(10);
			} else {
				threads[i].setPriority(1);
			}
		}
		
		for (Thread t : threads) {
			t.start();
		}
	}
}
