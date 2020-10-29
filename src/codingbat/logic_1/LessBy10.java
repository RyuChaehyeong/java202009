package codingbat.logic_1;
//3개의 int, abc를 지정하면 그 중 하나가 다른 하나보다 10 이상 적을 경우 true가 반환됩니다.
public class LessBy10 {
	public boolean lessBy10(int a, int b, int c) {
		  return (Math.abs(a-b)>=10) || (Math.abs(b-c)>=10) || (Math.abs(a-c) >=10);
		}
}
