package chap11.lecture.classClass;

import java.lang.reflect.Method;

public class ClassClass {
	public static void main(String[] args) throws Exception {
		Class clazz;
		//클래스 타입 객체 얻어오는 방법 3가지
		//1. class.forName(Class fullName)-문자열로 얻음
		clazz = Class.forName("java.lang.String");
		//forName은 checkedException을 발생 시킬 수 있어서(오타나 null) 예외처리 해야 함
		//clazz는 메소드, 필드, 생성자 정보 다 알고 있음
		
		Method m = clazz.getMethod("getBytes"); //Method type에 저장
		System.out.println(m); 
		
		
		//2. instacnce로 부터 얻음
		String s = "java";
		Class c2 = s.getClass();
		System.out.println(clazz == c2); //true
		
		
		//3. class 키워드로 얻음
		Class c3 = String.class; //클래스.class
		System.out.println(c2 == c3);
	}
}
