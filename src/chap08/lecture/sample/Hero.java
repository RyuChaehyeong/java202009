package chap08.lecture.sample;

public class Hero {
	private Gun gun;
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void attack() {
		gun.fire();
	}
	
	//hero가 어떤 총을 주워도 fire method가 있는 것이 보장, Hero가 바뀔 일이 없음
	
}
