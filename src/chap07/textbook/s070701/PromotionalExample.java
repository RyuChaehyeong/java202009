package chap07.textbook.s070701;

class A {}

class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}


public class PromotionalExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//실제 실행되는 메소드는 인스턴스의 메소드
		
		A a1 = b; //아래 타입에서 윗 타입으로 자동 형변환 가능
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//B b3 = e;
		//C c2 = d;
		
	}
}
