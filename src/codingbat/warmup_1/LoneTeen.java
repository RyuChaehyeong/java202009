package codingbat.warmup_1;

public class LoneTeen {
	public boolean loneTeen(int a, int b) {
		   boolean a_ = false;
		   boolean b_ = false;
		  if(a>=13 && a<20) {
		    a_ = true;
		  }
		  if(b>=13 && b<20) {
		    b_ = true;
		  }
		  
		  return a_^b_;
		}

}
