package codingbat.logic_1;

public class MaxMod5 {
	public int maxMod5(int a, int b) {
		  int res;
		  if(a != b) {
		    if(a%5 == b%5) {
		      res = a>b? b:a;
		    } else {
		      res = a>b? a:b;
		    }
		  } else {
		    res = 0;
		  }
		  
		  return res;
		}

}
