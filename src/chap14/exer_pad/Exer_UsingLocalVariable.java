package chap14.exer_pad;

import chap14.textbook.s140402.MyFunctionalInterface;

public class Exer_UsingLocalVariable {
	//UsingLocalVariable class 안에 method 정의, method안에 MyFunctionalInterface(s140402꺼) 재정의
	void method(int arg) {
		int localVar = 40;
		
		MyFunctionalInterface fi = () -> {
			System.out.println("localVar: "+localVar+"\n");
		};
		
		fi.method(); //Exer_Using의 method는 MyfuncInterface의 fi실행, localVar 40으로 고정
		
//		localVar = 50;  => 로컬 클래스에서 사용되는 변수는 final, 변경 될 수 없다. 
	}
}
