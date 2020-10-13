package chap06.lecture.constructor;

public class Hero {
	String name;
	int power;
	
	public Hero() {
		
	}
	
	public Hero (String name, int power) {
		this.name = name;
		//name = name이라고 하면 둘다 파라미터 name을 가리킴
		//this.라는 키워드를 사용하여 인스턴스 필드의 name을 가리키도록 하자
		//this는 인스턴스의 참조변수를 대신하는 키워드. 설계당시에는 참조변수를 몰라여
		this.power = power;
	}
	
	public Hero (String name) {
//		this.name = name;
//		this.power = 100; //위에 this.power = power;와 유사
		this(name, 100);
	}
	//이미 작성된 코드를 두번 쓸 필요 없으니까 
	//다른 생성자가 다른 생성자가 하는 일을 호출할 수 있다. 
	//적절한 파라미터 이름은 사싈 필드의 이름이랑 똑같다.
}

