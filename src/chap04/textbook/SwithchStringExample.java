package chap04.textbook;

public class SwithchStringExample {
	public static void main(String[] args) {
		String position = "과장";

		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
			break;
		}
		
		//A switch works with the byte, short, char, and int primitive data types. 
		//It also works with enumerated types (discussed in Enum Types)
	}
}
