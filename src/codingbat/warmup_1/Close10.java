package codingbat.warmup_1;

public class Close10 {
	public int close10(int a, int b) {
		  int near;
		  int a_bw10 = 10-a;
		  int b_bw10 = 10-b;
		  
		  if(a_bw10<0) {
		    a_bw10 *= -1;
		  }
		  
		  if(b_bw10<0) {
		    b_bw10 *= -1;
		  }
		  
		  if(a_bw10>b_bw10) {
		    near = b;
		  } else if (a_bw10 == b_bw10) {
		    near = 0;
		  } else {
		    near = a;
		  }
		  
		  return near;
		  
		}

}
