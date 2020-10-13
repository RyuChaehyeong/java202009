package chap06.textbook.s060802;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
		//파라미터를 필드에 저장하는 기능을 하는 메소드
		//클래스에 의해 생성될 인스턴스를 지칭하는 키워드
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run () {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다. (gas잔량:"+gas+")");
				gas  -= 1;
			} else {
				System.out.println("gas 잔량:"+gas+")");
				return;
				//리턴값이 없는 메소드로 gas필드 값이 0이면 return 문이 메소드를 강제종료
			}
		}
	}
	
	
}
