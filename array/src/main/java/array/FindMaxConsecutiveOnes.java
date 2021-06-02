package array;

public class FindMaxConsecutiveOnes {
	public static int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int currentWindowOnes = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 1) {
				currentWindowOnes++;

			} else if (nums[i] == 0 && nums[i - 1] == 1) {
				if (count < currentWindowOnes) {
					count = currentWindowOnes;

				}
				currentWindowOnes = 0;
			} else {
				currentWindowOnes = 0;
			}
		}

		return count;
	}
	public static void main(String[] args) {
		System.out.println(findMaxConsecutiveOnes(new int[] {1,1,1,1,1,0,0,1,1,1,1,0,0,1,1,0,1,1,1,1,1,1,0}));
	}
}
