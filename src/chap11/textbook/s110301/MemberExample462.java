package chap11.textbook.s110301;

public class MemberExample462 {
	public String id;

	public MemberExample462(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MemberExample462) { //매개 값이 Member 타입인지 확인
			MemberExample462 member = (MemberExample462) obj;
			if(id.equals(member.id)) {
				return true;		//Member type으로 Casting 후에 id필드 값이 동일한지 검사하고 동일하면 true 리턴
			}
		}
		return false; 				//매개값이 Member type이 아니거나 id필드 값이 다른 경우 false를 리턴
	}
}
