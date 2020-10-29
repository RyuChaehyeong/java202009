package chap13.textbook.s130401;

import chap13.textbook.s130202.Box;

public class BoxingMethodExample {
	public static void main(String[] args) {
		//static이니까 class명.method 호출 가능
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
