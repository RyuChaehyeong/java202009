package chap02.type;

public class CharType {
	public static void main(String[] args) {
		//char : 2byte
		//작은 따옴표를 이용하여 하나의 문자를 표현
		
		char charValue;
		 charValue = 'a';
		 System.out.println(charValue);
		 
//		charValue ='ab';
//		charValue = ''; //빈 문자열 가질 수 없다.
		charValue =' '; //spacebar가능
		charValue = 44032; // 16bit가능
		System.out.println(charValue);
		
		charValue = '나';
		System.out.println(charValue);
		
		charValue = '\uac00'; //44032
		System.out.println(charValue);
	}
}
