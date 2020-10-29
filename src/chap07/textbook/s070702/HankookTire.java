package chap07.textbook.s070702;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명: " +(maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("*** "+location+" HankookTire 평크 ***");
			return false;
		}
	}
}
