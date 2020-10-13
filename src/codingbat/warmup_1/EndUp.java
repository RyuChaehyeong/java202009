package codingbat.warmup_1;

public class EndUp {
	public String endUp(String str) {
		  String back = "";
		  String res = "";
		  String up = "";
		  
		 if (str.length()>=3) {
		   String front = str.substring(0, str.length()-3);
		   back = str.substring(str.length()-3);
		   up = back.toUpperCase();
		   res = front + up;
		 } else {
		   res = str.toUpperCase();
		   
		 }

		  return res;
		 
		}
	
}
