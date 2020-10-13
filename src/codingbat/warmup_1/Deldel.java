package codingbat.warmup_1;

public class Deldel {
	public String delDel(String str) {
		  String res = str;
		  if(str.length()>=4) {
		   if(str.substring(1,4).equals("del")) {
		     char front = str.charAt(0);
		     String back = str.substring(4);
		     res = front+back;
		   } 
		  }
		  return res;
		}

}
