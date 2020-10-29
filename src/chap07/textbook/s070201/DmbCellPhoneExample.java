package chap07.textbook.s070201;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델: "+dmbCellPhone.model);
		System.out.println("색상: "+dmbCellPhone.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널: "+dmbCellPhone.channel);
		
		//CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요 전 홍길동이 입니다");
		dmbCellPhone.sendVoice("아예 반갑습니다.");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone 메소드 호출
		dmbCellPhone.turnOnDmb(7);
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
