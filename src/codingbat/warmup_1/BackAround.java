package codingbat.warmup_1;

public class BackAround {
	public String backAround(String str) {
		  char c = str.charAt(str.length()-1);
		  return c+str+c;
		}
}
