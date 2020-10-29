package chap09.textbook.exercise.p06;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		final String nickNamecopy = nickName;
		//nickNamecopy는 복사본이라 상관없음
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "["+nickNamecopy+"]"+inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}
//로컬에서 쓰이는 것은 final이어서 수정 불가임