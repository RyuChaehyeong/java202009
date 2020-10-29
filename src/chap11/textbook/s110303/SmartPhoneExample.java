package chap11.textbook.s110303;

public class SmartPhoneExample {
	public static void main(String[] args) {
		Smartphone myPhone = new Smartphone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
		
	}
}
