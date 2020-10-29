package chap07.lecture.polymorphism;

public class MyApp {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.cry();
		KindaCat k1 = t1; //tiger는 k1에 들어갈 수 있다.
//		t1 = k1;
		k1.cry();//어흥!
		//k1이어도 t1은 호랑이니까 어흥하고 움, 고양이과가 웁니다.x
		//실제 인스턴스는 호랑이! 실제 인스턴스의 메소드가 실행됨
		
		
		
		Cat c1 = new Cat();
		c1.cry();
		KindaCat k2 = c1; //cat은 KindaCat에 들어갈 수 있다. 
		
		k2.cry();//야옹
		//k1이어도 t1은 호랑이니까 어흥하고 움, 고양이과가 웁니다.x
		//실제 인스턴스는 호랑이! 실제 인스턴스의 메소드가 실행됨
		
//		c1 = k2;
		
//		c1 = t1;
//		t1 = c1;
	}
}
