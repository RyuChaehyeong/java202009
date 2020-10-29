package chap07.textbook.exercise.p06;

public class Child extends Parent{
	private String name;
	
	public Child() {
		this("홍길동"); //String을 받는 생성자를 호출하는 일을 함. !!!!
		System.out.println("Child() call");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
	
	
}
