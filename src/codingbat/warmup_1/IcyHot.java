package codingbat.warmup_1;

public class IcyHot {
	public boolean icyHot(int temp1, int temp2) {
		  boolean res = false;
		  if ((temp1<0&&temp2>100)||(temp1>100&&temp2<0)){
		    res = true;
		  }
		  return res;
		}

}
