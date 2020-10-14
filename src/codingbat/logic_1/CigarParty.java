package codingbat.logic_1;

public class CigarParty {
	public boolean cigarParty(int cigars, boolean isWeekend) {
		  boolean res = false;
		  if(isWeekend) {
		   return cigars >= 40;
		  } else {
		    return (cigars >= 40 && cigars <= 60);
		  }
		}
}
