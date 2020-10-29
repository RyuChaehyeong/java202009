package chap09.textbook.exercise.p05;

public class Anonymous {
	Vehicle field = new Vehicle() { // 필드에 익명객체 할당
		
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	
	void method1() {
		Vehicle localVar = new Vehicle() { //메소드 변수에 익명객체 할당
			
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		localVar.run();
		
	}
		void method2(Vehicle v) { //파라미터로, Vehicle type이면 run method보장
			v.run();
	}
}
