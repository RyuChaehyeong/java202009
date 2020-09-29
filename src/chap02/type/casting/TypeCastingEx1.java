package chap02.type.casting;

public class TypeCastingEx1 {
	public static void main(String[] args) {
		//boolean , byte << char , short << int , float << long , double
		
		
		byte byteValue = 3;
		short shortValue  = 129;
		int intValue = 1000000;
		long longValue = 10000000000L;
		
		// [1] 자동 형변환
		shortValue = byteValue;
		intValue = shortValue;
		longValue = intValue;
		
		// [2] 강제 형변환
		longValue = 3333;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		// 자동형변환 (정수 -> 실수)
		float floatValue = 0.0F;
		double doubleValue = 0.0;
		
		doubleValue = intValue;
		floatValue = intValue;
		//같은 4bit지만 잃어버리는 값이 생길 수도 있다.
		
		floatValue = longValue;
		//float type은 long type보다 더 넓은 범위 표현 가능
		doubleValue = longValue;
		//정수부를 저장하는 범위에 차이가 있어서 형변환시 주의해야 한다. 
		//ex) float는 23bit만 정수저장
		
		
		//강제 형변환 (실수-> 정수)
		intValue = (int)floatValue;
		
	}
}
