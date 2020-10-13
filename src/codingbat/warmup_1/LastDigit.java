package codingbat.warmup_1;

public class LastDigit {
	public boolean lastDigit(int a, int b) {
		  boolean res = false;
		  
		  int re_a = a%10;
		  int re_b = b%10;
		  
		  if(re_a == re_b) {
		    res = true;
		  }
		  return res;
		}

}
