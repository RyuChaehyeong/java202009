package chap09.lecture.anonymous;

public class MyApp {
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.method1();
		
		//Child class가 자주 사용되지 않는다면? 클래스를 따로 정의 하지 않고
		//클래스 정의와 인스턴스 생성을 한번에!
		Parent p2 = new Parent() {
			//여기 안에는 class의 body!
			//필드와 메소드 작성
			@Override
			public void method1() {
				System.out.println("anonymous method1");
			}
		};
		p2.method1(); //인스턴스 메소드(재정의됨) 실행
		
		
		Parent p3 = new Parent() {
			
		}; //상속과 인스턴스 생성을 한번에 할려고 추상클래스와 같이 사용
	}
}
