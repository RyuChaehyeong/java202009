package chap11.string.method;

public class Trim {
	public static void main(String[] args) {
		String str12 = "    ja   v a    ";
		String t = str12.trim();
		//앞뒤 공백만 제거, 중간 공백 제거 xx
		System.out.println(t);
		System.out.println(str12);
	}
}
