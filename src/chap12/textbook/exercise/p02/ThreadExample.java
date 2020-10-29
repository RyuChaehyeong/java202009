package chap12.textbook.exercise.p02;

public class ThreadExample {
	public static void main(String[] args) {
		Thread t1 = new MovieThread();
		t1.start();
		
		Thread t2 = new Thread(new MusicRunnable());
		t2.start();
	}
}
