package codingbat;

public class AlarmClock {
	public String alarmClock(int day, boolean vacation) {
		String mes = "";
		if (vacation) {
			switch (day) {
			case 0:
			case 6:
				mes = "off";
				break;
			default:
				mes = "10:00";
				break;
			}
		} else {
			switch (day) {
			case 0:
			case 6:
				mes = "10:00";
				break;
			default:
				mes = "7:00";
				break;
			}

		}
		return mes;
	}
}
