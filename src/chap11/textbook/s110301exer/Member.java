package chap11.textbook.s110301exer;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}
	
	//서로 다른 객체이지만 id가 같으면 
	//같은 멤버라고 equals의 기능을 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(this.id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
