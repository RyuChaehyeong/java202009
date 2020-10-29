package chap08.textbook.s080503;

import chap08.textbook.s080502.*;

public class Car {
	
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};


	public void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}

}
