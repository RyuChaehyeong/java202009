package codingbat.logic_1;

public class TeaParty {
	public int teaParty(int tea, int candy) {
		  
		  if (tea < 5 || candy < 5) {
		    return 0;
		  }
		  
		  else if (tea >= candy*2 || tea*2 <= candy) {
		    return 2;
		  }
		  
		  return 1;
		}

}
