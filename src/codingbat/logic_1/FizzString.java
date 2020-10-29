package codingbat.logic_1;

public class FizzString {
	public String fizzString(String str) {
		  String res = str;
		  boolean f = str.charAt(0)=='f';
		  boolean b = str.charAt(str.length()-1)=='b';
		  
		  if(f) {
		    res = "Fizz";
		  }
		  
		  if(b) {
		    res = "Buzz";
		  }
		  
		  if(f&&b) {
		    res = "FizzBuzz";
		  }
		  
		  return res;
		}

}
