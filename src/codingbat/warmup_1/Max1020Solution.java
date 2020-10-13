package codingbat.warmup_1;

public class Max1020Solution {
	public int max1020(int a, int b) {
		  if(b>a) {
		    int temp = a;
		    a = b;
		    b = temp;
		  }
		  //From here, a is bigger!
		  if(a>=10&&a<=20) return a;
		  if(b>=10&&b<=20) return b;
		  return 0;
		}

}
