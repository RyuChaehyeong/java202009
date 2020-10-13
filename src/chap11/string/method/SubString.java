package chap11.string.method;

public class SubString {
	public static void main(String[] args) {
		String str11 = "0123456789";
		String str12 = str11.substring(2,3);
		//두번째 파라미터 미포함
		System.out.println(str12); //2만 나옴
		str12 = str11.substring(2,str11.length());
		//두번째 파라미터 미포함, length()-1이 아닌 length() 쓰기
		//파라미터 하나 쓰면 끝까지 나옴.
		System.out.println(str12);
		
		str12 = str11.substring(2);
		System.out.println(str12);
		
		
	}
}
