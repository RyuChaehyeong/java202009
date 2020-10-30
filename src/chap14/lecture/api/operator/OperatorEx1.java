package chap14.lecture.api.operator;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorEx1 {
	//매개변수 타입이랑 리턴타입이 같은 Function 
	public static void main(String[] args) {
		UnaryOperator<Integer> op1 = x -> x * x;
		int r = op1.apply(3);
		System.out.println(r);
		
		BinaryOperator<Integer> op2 = (x, y) -> x + y;
		System.out.println(op2.apply(10, 20));
	}
}
