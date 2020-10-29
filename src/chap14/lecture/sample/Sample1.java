package chap14.lecture.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Sample1 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("java");
		names.add("html");
		names.add("css");
		names.add("jsp");
		names.add("servlet");
		
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println("===========================");
		
//		Consumer<String> o1 = (s) -> System.out.println(s);;
		
		//아예 forEach 안에 객체를 넣음
		names.forEach(s -> System.out.println(s));
		
		/* List 타입의 names에 for each라는 메소드를 사용하고 싶다.
		 * for each는 향상된 for문 같이 하나씩 가져와서 정해진 일을 수행하는 것임
		 * 
		 * for each 메소드에 필요한 파라미터는 Consumer 타입의 객체이다.
		 * Consumer도 interface이다. 근데 Consumer interface는 @FunctinalInterface이다.
		 * 		=> functionalInterface는 Override 해야하는 method 딱 하나있기때문에 
		 * 		   람다식을 쓸 수가 있다. 
		 * 
		 *  [원래 같으면] 
		 *  Consumer<String> o1 = new 컨수머구현 클래스명<>(){
		 *  	public void accept(T t) {
		 *  	//(임의로 출력하는 메소드로)
		 *  	System.out.println(t);
		 *  	}
		 *  }; //Consumer 객체 만들고 accept 재정의
		 *  
		 * 		=> 이렇게 해야 함.
		 * 
		 *  [근데 람다식을 사용하면]
		 *  Consumer<String> o1 = (t) -> System.out.println(t);
		 *  이렇게 쓴다음에
		 *  names.forEach(o1);
		 *  
		 *  	=> 이렇게 까지 줄일 수 있다.
		 *  
		 *  근데 객체를 forEach( ) 메소드 파라미터 안에서 만들면 
		 *  names.forEach( t -> System.out.println(t);
		 *  까지 줄일 수 있다는 내용이다.
		 *  
		 *  		내일 할 것으 맛보기라고 하는데,,,,
		 *  
		 * */
	}
	
}
