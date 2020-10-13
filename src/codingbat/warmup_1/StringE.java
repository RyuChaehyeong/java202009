package codingbat.warmup_1;

public class StringE {

	public boolean stringE(String str) {
		  boolean res = false;
		  int cnt = 0;
		  
		  for(int i = 0; i<str.length(); i++) {
		    if(str.charAt(i)=='e') {
		      cnt ++;
		    }
		  }
		  
		  if(cnt==1 || cnt==3) {
		    res = true;
		  }
		  return res;
		}

}


