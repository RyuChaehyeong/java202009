package chap07.textbook.s070702.practice1;

public class Tire {
	//필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}


	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+" Tire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}
		System.out.println("*** "+location+" Tire 펑크 ***");
		return false;
	}
	
	//메서드

	
}
