package codingbat.warmup_1;

public class EndUp {
	public String endUp(String str) {
		  if(str.length()>=3) {
		    String front = str.substring(0, str.length()-3);
		    String back = str.substring(str.length()-3,str.length());
		    String BACK = back.toUpperCase();
		    
		    return front + BACK;
		  }
		  return str.toUpperCase();
		}
	
}
