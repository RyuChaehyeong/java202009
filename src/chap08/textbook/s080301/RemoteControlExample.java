package chap08.textbook.s080301;

import chap08.textbook.s080201.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		//RemoteControl 인터페이스로 구현 객체인 Television과 Audio를
		//사용하려면 다음과 같이 RemoteControl 타입 변수로 rc를 선언하고 구현 객체 대입
		
		rc.setMute(true);
		
		RemoteControl.changeBattery();
		//static method는 interface이름으로 접근하여 사용가능
	}
}
