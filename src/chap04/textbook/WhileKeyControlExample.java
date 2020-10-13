package chap04.textbook;

public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception{
		/*
		System.out.println("입력>");
		int i = System.in.read(); //입력받을 준비
		int j = System.in.read(); 
		int k = System.in.read(); 
		
		//키보드 입력을 6도 하고 enter도 침
		//enter는 key code를 13과 10 두개를 가지고 있다. 
		
		System.out.println("출력");
		System.out.println(i);
		System.out.println(j);//13
		System.out.println(k);//10
		*/
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while (run) {
			if (keyCode !=13 && keyCode != 10) {
				//처음 만난 keyCode는 영
				System.out.println("---------------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("---------------------------------");
				System.out.println("선택: ");
			}
			
			keyCode = System.in.read();
			
			if (keyCode == 49 ) {
				speed ++;
				System.out.println("현재 속도=" +speed );
			} else if (keyCode == 50) {
				speed --;
				System.out.println("현재 속도="+speed);
			} else if (keyCode == 51) {
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");
		
	}
}




































