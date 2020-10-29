package chap11.textbook.s110301exer;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		//세개의 서로 다른 객체이지만 id가 같으면 
		//같은 멤버라고 equals의 기능을 재정의
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj2.equals(obj3)) {
			System.out.println("obj2와 obj3는 동등합니다.");
		} else {
			System.out.println("obj2와 obj3는 동등하지 않습니다.");
		}
	}
}
