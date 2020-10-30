package chap14.lecture.api.supplier;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierEx1 {
	public static void main(String[] args) {
		
		Supplier<Double> nextDouble = () -> Math.random();
		for (int i = 0; i < 6; i++) {
			System.out.println(nextDouble.get());
		}
		DoubleSupplier nextDouble2 = () -> Math.random();
		
		
		IntSupplier nextLottoBall = () -> (int) (Math.random()*45+1);		
		for (int i = 0; i < 6; i++) {
			System.out.println(nextLottoBall.getAsInt());
		}
	}
}
