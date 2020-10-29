package chap09.textbook.s090502;

public class Button {
	
	OnClickListener listener;
	
	void setOnClicklistener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
		//구현 객체의 onClick() 메소드 호출
	}
	
	
	interface OnClickListener {
		void onClick();
	}
}
