package chap06.lecture.constructor;

public class ConstructorEx02 {
	public static void main(String[] args) {
		System.out.println("===ironMan===");
		Hero h1 = new Hero("ironMan", 100);
		System.out.println(h1.name);
		System.out.println(h1.power);
		System.out.println();
		System.out.println("===thor===");
		Hero h2 = new Hero("thor", 200);
		System.out.println(h2.name);
		System.out.println(h2.power);
		System.out.println();
		//이때는 참조변수 사용가능 
		System.out.println("===spider===");
		Hero h3 = new Hero("spiderMan");
		System.out.println(h3.name);
		System.out.println(h3.power);
	}
}
