package chap03.binary;

public class LogicalOperator {
		public static void main(String[] args) {
			//논리연산자
						
			// && & and, 양변이 모두 true일때만 true
			//하나라도 false면 false
			System.out.println("=====and=====");
			System.out.println(true&&true); //true
			System.out.println(true&&false); //false
			System.out.println(false&&true); //false
			System.out.println(false&&false); //false
			
			
			// || | or , 양변이 false일때만 false
			//하나라도 true면 true
			System.out.println("=====or=====");
			System.out.println(true||true); //true
			System.out.println(true||false); //true
			System.out.println(false||true); //true
			System.out.println(false||false); //false
			
			
			//  ^ xor (exclusive or, 배타적 논리합): 다를 때만 true
			System.out.println("=====xor=====");
			System.out.println(true^true); //false
			System.out.println(true^false); //true
			System.out.println(false^true); //true
			System.out.println(false^false); //false
			
			
			//&& vs &의 차이
			System.out.println("============&|=============");
			int a = 3;
			System.out.println(false & false);
			System.out.println(false & true);
			System.out.println((a<0) & (a++<0));
			System.out.println(a);
			//앞에거가 false인 것이 판단되어도 뒤에 연산함
			//a++ 4
			
			//앞에가 false니까 뒤에꺼 안봐도 false
			System.out.println(false&&false);
			System.out.println(false&&true);
			System.out.println((a<0) && (a++<0));
			System.out.println(a);
			//앞에거가 false이면 뒤에 연산 굳이 안함 (short circuit)
			//a++ 여전히 4
			
			//&&은 앞에가 false일 때 short circuit발동
			//||은 앞에가 true일 때 short circuit발동
			
			
		}

}
