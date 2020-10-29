package codingbat.logic_1;

public class FizzString2 {
	public String fizzString2(int n) {
		  String res = "";
		  if(n%3 != 0 && n%5 != 0){
		    res += n;
		  } 
		  if (n%3==0) {
		    res += "Fizz";
		  } 
		  if (n%5==0) {
		    res += "Buzz";
		  }
		  
		  res += "!";
		  
		  return res;
		}
}
