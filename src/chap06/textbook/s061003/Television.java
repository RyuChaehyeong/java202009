package chap06.textbook.s061003;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static { //static block! Executing first
		info = company +"-"+ model;
	}
}
