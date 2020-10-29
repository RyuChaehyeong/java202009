package chap15.textbook.s150601;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//리스트 인터페이스 기반, 리스트 특징을 가짐
		System.out.println(coinBox.get(1).getValue()); //50
		System.out.println(coinBox.get(2).getValue()); //500
		System.out.println(coinBox.get(3).getValue()); //100
		
		/******************************************************/
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전: " + coin.getValue()+"원");
		} //pop method는 아이템을 지우기까지 하는 것
		
	
	}
}
