package chap11.textbook.s110603;

public class NewInstanceExample {
	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("chap11.textbook.s110603.SendAction");
			Action action = (Action) clazz.newInstance(); 
			//newInstance는 Object type
			//execute method는 Object type이 아니라 Action type이 가지고 있으니까 Casting 해야함
			//	(SendAction이 Action interface를 implements 했으니까 강제 Casting 가능)
			//clazz의 실제 인스턴스는 SendAction이고 SendAction에서 Override된 execute 메소드 사용가능
			
			action.execution(); //실제 인스턴스의 메소드 실행 (결과: 데이터를 보냅니다.)
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
		}
		
	}
}
