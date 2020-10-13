package codingbat.warmup_1;

public class In3050 {
	public boolean in3050(int a, int b) {
		  boolean res = false;
		  if((a>=30 && a<=40) && (b>=30 && b<=40)){
		    res = true;
		  }
		  
		  if((a>=40 && a<=50) && (b>=40 && b<=50)){
		    res = true;
		  }
		  return res;
		}

}
