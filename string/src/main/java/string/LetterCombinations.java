package string;

public class LetterCombinations {
	public int[] sortedSquares(int[] nums) {
		int i = 0, j = nums.length - 1, k = nums.length - 1;
		int[] ans = new int[nums.length];

		while (i < j) {
			if (nums[i] * nums[i] > nums[j] * nums[j]) {
				ans[k] = nums[i] * nums[i];
				i++;

			} else {
				ans[k] = nums[j] * nums[j];
				j--;
			}
			k--;
		}

		ans[k] = nums[j] * nums[j];

		return ans;
	}

	public void duplicateZeros(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				for (int j = arr.length - 1; j > i + 1; j--) {
					arr[j] = arr[j - 1];
				}
				if (i + 1 < arr.length - 1)
					arr[i + 1] = 0;
				i = i + 1;
			}
		}
	}

	public int removeElement(int[] nums, int val) {
		int count = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == val) {
				count++;
				for (int j = i; j < nums.length; j++) {
					if (j + 1 < nums.length) {
						nums[j] = nums[j + 1];
					}
				}
			}
		}

		return nums.length - count;

	}

	public static void main(String[] args) {
		new LetterCombinations().removeElement(new int[] { 1, 5, 2, 0, 6, 8, 0, 6, 0 }, 0);

	}
}
