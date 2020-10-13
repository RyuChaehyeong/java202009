package codingbat.warmup_1;

public class StartHi {
	public boolean startHi(String str) {
		  boolean res = false;
		  if (str.length()>=2) {
		    String s = str.substring(0,2);
		    if(s.equals("hi")) {
		      res = true;
		    }
		  }
		  return res;
		}

}
