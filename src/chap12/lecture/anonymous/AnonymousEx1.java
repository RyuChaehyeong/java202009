package chap12.lecture.anonymous;

public class AnonymousEx1 {
	//스레드 객체를 익명 클래스로 만드는 법
	
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					}
			}
		};
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <5; i++) {
					System.out.println((char)('a'+i));
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		});
		
		Thread t3 = new Thread(() ->  {
			for (int i = 0; i < 5; i++) {
				System.out.println((char)('Z'-i));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		//람다식 , 인터페이스 중에 추상메소드가 하나만 있으면 메소드 명을 생략해도 됨
		t1.start();
		t2.start();
		t3.start();
	}
}
