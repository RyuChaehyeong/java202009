package codingbat.Warmup_2;

public class AltPairs {
	public String altPairs(String str) {
		  String res = "";
		  
		  int len = str.length();
		  if(len % 4 == 1) {
		    for(int i = 0; i<len/4; i++) {
		      res += str.charAt(4*i);
		      res += str.charAt((4*i)+1);
		    }
		    res += str.charAt((len/4)*4);

		  } else if (len % 4 ==0) {
		     for(int i = 0; i<len/4; i++) {
		      res += str.charAt(4*i);
		      res += str.charAt((4*i)+1);
		    }
		    
		  } else if (len == 0){
		    res = str;
		  
		  } else {
		    for(int i = 0; i<=len/4; i++) {
		      res += str.charAt(4*i);
		      res += str.charAt((4*i)+1);
		    }
		  }
		  

		  return res;
		}

}
