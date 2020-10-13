package codingbat.warmup_1;

public class Max1020 {
	public int max1020(int a, int b) {
		  int res = 0;
		  int max = 0;
		  int min =0; 
		  
		  if(a>b) {
		    max = a;
		    min = b;
		  } else if (a<b) {
		    max = b;
		    min = a;
		  }
		  
		  if(max>= 10 && max <=20) {
		    res = max;
		  } else if (min >= 10 && min <= 20) {
		    res = min;
		  }
		  

		  
		  return res;
		}

}
