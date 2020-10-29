package chap11.textbook.s110601;

import chap06.textbook.s060802.Car;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass(); //인스턴스로 부터 클래스정보
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		
		try {
			Class clazz2 = Class.forName("chap06.textbook.s060802.Car");  //문자열로 클래스 찾기
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) { //오타때매
			e.printStackTrace();
		}
	}
}
