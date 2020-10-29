package codingbat.logic_1;

public class withoutDoubles {
	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		  int res;
		  int sum = die1 + die2;
		  if(noDoubles) {
		    if(die1==6 && die2==6) {
		      res = 7;      
		    } else {
		      res = die1 == die2? sum+1 : sum;
		    }
		  } else {
		    res = sum;
		  }
		  return res;
		}

}
