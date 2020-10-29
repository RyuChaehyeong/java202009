package chap08.textbook.s080302;

import chap08.textbook.s080201.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				/*실행문*/
			}
			
			@Override
			public void turnOff() {
				/*실행문*/
			}
			
			@Override
			public void setVolume(int volume) {
				/*실행문*/
			}
		};
	}
}
