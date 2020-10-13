package chap06.exercise.p14;

public class MemberExercise {
	public static void main(String[] args) {
		
		Member user1 = new Member("홍길동", "hong");
		Member user2 = new Member("김자바", "java");
		
		System.out.println("===출력 확인===");
		System.out.println(user1.name);
		System.out.println(user1.id);
		System.out.println(user2.name);
		System.out.println(user2.id);
	
	
	}
	
}
