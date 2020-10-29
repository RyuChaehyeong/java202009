package chap07.lecture.polymorphism.sample;

public class MyApp {
	public static void main(String[] args) {
		Hero hero = new Hero();
		
		hero.setGun(new FireGun());
		hero.attack();//불이 나갑니다. (실제 인스턴스 메소드 실행)
		
		hero.setGun(new WaterGun());
		hero.attack(); //물을 쏩니다. (실제 인스턴스 메소드 실행)
	}
}
