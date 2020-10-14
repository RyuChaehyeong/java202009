package chap06.lecture.packageKeyword;

import chap06.lecture.MyClass;

//단축키 ctrl+shift+o -> 필요한 package안에 class import
import java.lang.String; //java.lang package에 있는 것은 생략이 가능
import java.util.*; //util package에 있는 것 모두 import

public class MyApp {
	public static void main(String[] args) {
		chap06.lecture.packageKeyword.MyClass o1 
		= new chap06.lecture.packageKeyword.MyClass();
		//같은 패키지에 있을 때는..
		
		MyClass o2 = new MyClass(); //같은 패키지에 있으면 import 할 필요x
		
		chap06.lecture.MyClass o3 = new chap06.lecture.MyClass();
		//패키지명     클래스명     new 패키지명       클래스명
		
		 java.util.Scanner sc = new java.util.Scanner(System.in);
		 java.lang.String str = "java";
		 //복잡쓰.. 다른 패키지에 있는 경우에 다른 패키지에 있는 클래스를 쓰겠다고 위에 import 선언!
		 Scanner sc2 = new Scanner(System.in);
		 String str2 = "css";
	}
}
