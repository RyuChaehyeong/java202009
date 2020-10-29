package chap15.textbook_exer.s150201;

public class Member {
	public String name;
	public int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//이름과 나이가 같으면 동일한 객체로 간주
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
		
	}
}
