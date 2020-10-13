package codingbat.warmup_1;

public class MixStart {
	public boolean mixStart(String str) {
		  boolean res = false;
		  
		  if(str.length()>=3){
		    if(str.substring(1,3).equals("ix")){
		      res = true;
		    }
		  }
		  return res;
		}

}
