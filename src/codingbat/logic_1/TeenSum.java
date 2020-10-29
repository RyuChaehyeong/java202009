package codingbat.logic_1;

public class TeenSum {
	public int teenSum(int a, int b) {
		  int sum = a+b;
		  boolean a_teen = (a>=13 && a<=19);
		  boolean b_teen = (b>=13 && b<=19);

		  if(a_teen || b_teen) {
		    sum = 19;
		  }
		  return sum;
		}

}
