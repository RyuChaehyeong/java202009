package chap14.lecture.api.predicate;

import java.util.function.Predicate;

public class PredicateEx1 {
	public static void main(String[] args) {
		//Predicate interface의 test abstract method Override
		Predicate<Integer> isEven = x -> x%2 == 0;
		Predicate<Integer> isOdd = x -> x%2 == 1;
		
		boolean b = isEven.test(25);
		System.out.println(b);
		
		System.out.println(isOdd.test(33));
	}
}
