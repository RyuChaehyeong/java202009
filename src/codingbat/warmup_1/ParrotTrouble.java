package codingbat.warmup_1;

public class ParrotTrouble {
	public boolean parrotTrouble(boolean talking, int hour) {
		  return (hour < 7 || hour >20)&& (talking)? true : false;
		  //그냥 return (hour < 7 || hour >20)&& (talking) 해도 댐
		}
}
