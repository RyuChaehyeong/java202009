package codingbat.warmup_1;

public class EveryNth {
	public String everyNth(String str, int n) {
		  String word = "";
		  for (int i=0; i<str.length(); i+=n) {
		    word+=str.charAt(i);
		  }
		  return word;
		}

}
