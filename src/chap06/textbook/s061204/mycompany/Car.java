package chap06.textbook.s061204.mycompany;

import chap06.textbook.s061204.hankuk.SnowTire;
import chap06.textbook.s061204.hyundai.Engine;
import chap06.textbook.s061204.kumho.BigWidthTire;

public class Car {
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	//풀네임을 적으면 같은 이름의 클래스 구분하여 사용가능
	chap06.textbook.s061204.hankuk.Tire tire3 = new chap06.textbook.s061204.hankuk.Tire();
	chap06.textbook.s061204.kumho.Tire tire4 = new chap06.textbook.s061204.kumho.Tire();
}
