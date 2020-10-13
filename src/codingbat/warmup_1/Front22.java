package codingbat.warmup_1;

public class Front22 {
	public String front22(String str) {
		  String s;
		  if (str.length()>=2) {
		    s = str.substring(0,2);
		  } else {
		    s = str;
		  }
		  return s+str+s;
		}

}
