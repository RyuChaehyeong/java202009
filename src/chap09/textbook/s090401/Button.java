package chap09.textbook.s090401;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener (OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
		//실제 인스턴스의 onClick() 메소드 호출
	}
	
	interface OnClickListener {
		void onClick();
	}
	
	
}
