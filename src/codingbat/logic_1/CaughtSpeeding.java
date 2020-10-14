package codingbat.logic_1;

public class CaughtSpeeding {
	public int caughtSpeeding(int speed, boolean isBirthday) {
		int res = 0;
		if (isBirthday) {
			if (speed > 65 && speed <= 85)
				res = 1;
			else if (speed > 85)
				res = 2;
		} else {
			if (speed > 60 && speed <= 80)
				res = 1;
			else if (speed > 80)
				res = 2;
		}
		return res;
	}

}
