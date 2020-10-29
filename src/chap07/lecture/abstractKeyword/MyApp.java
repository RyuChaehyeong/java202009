package chap07.lecture.abstractKeyword;

public class MyApp {
	public static void main(String[] args) {
		KindaCat o1 = new Cat();
		o1.cry();
		KindaCat o2 = new Tiger();
		o2.cry();
		//KindaCat o3 = new KindaCat(); 
		//abstract를 붙이게 되면 new 연산자를 이용해 객체를 만들지 못하고
		//상속을 통해 자식 클래스만 만들 수 있다.
	}
}
