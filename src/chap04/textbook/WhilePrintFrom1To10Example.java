package chap04.textbook;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		System.out.println("==================");
		while (i <= 10) {
			System.out.println(i);
			sum += i;
			i++;
		}
		System.out.println("1~" + (i-1) + "합:" +sum);
		System.out.println("==================");
		
		int j = 11;
		while (j <= 20) {
			System.out.println(j);
			j++;
		}
		
		System.out.println("==================");
		int k = 1;
		while (k <= 10) {
			System.out.println(k);
			k+=2;
		}
		System.out.println("==================");
		int l = 10;
		while (l>=1) {
			System.out.println(l);
			l--;
		}
		System.out.println("==================");
		int m = 10;
		while (m>1) {
			System.out.println(m);
			m-=2;
		}
	
	}
}
