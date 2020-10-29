package chap12.textbook.s120201;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
				
			
		}
		
		for(int i = 0; i<5 ; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
		
		//소리가 난 다음에 출력이 따로됨
	}
}
