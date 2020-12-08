package codingbat.Warmup_2;

public class Array667 {
	public static int array667(int[] nums) {
		int cnt = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 6) {
				if ((nums[i + 1] == 6) || (nums[i + 1] == 7)) {
					cnt++;
				}
			}

		}
		return cnt;

	}
	
	public static void main(String[] args) {
		int[] ar_num = {6, 7, 6, 6, 4};
		int res= Array667.array667(ar_num);
		System.out.println(res);
	}
	
}
