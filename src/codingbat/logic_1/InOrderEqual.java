package codingbat.logic_1;

public class InOrderEqual {
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		  if(equalOk) {
		    if(a==b) {
		      return b<=c;
		    } else if (a<b) {
		      return b==c;
		    } 
		    
		  } else {
		    if (a < b) {
		      return (b < c);
		    }
		  }
		  return false;
		}
}
