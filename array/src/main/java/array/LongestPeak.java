package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestPeak {
	public static int longestPeak(int[] array) {
		int max = 0;
		for (int i = 1; i < array.length - 1; i++) {
			if (checkIfPeak(array, i)) {
				List<Integer> lengthAndRightSlopeLength = calculateLength(array, i);
				if (lengthAndRightSlopeLength.get(0) > max) {
					max = lengthAndRightSlopeLength.get(0);
				}
			}
		}
		return max;
	}

	private static List<Integer> calculateLength(int[] a, int i) {
		int rightSlopeLength = 0;
		int leftSlopeLength = 0;

		for (int k = i; k > 0; k--) {
			if (a[k] > a[k - 1]) {
				leftSlopeLength++;
			} else {
				break;
			}
		}
		for (int k = i; k < a.length-1; k++) {
			if (a[k] > a[k + 1]) {
				rightSlopeLength++;
			} else {
				break;
			}
		}

		return new ArrayList<>(Arrays.asList(rightSlopeLength + leftSlopeLength + 1, rightSlopeLength));
	}

	/*
	 * 
	 * O(1) time
	 */
	private static boolean checkIfPeak(int[] array, int i) {
		boolean flag= (array[i] > array[i + 1]) && array[i] > array[i - 1];

		return flag;
	}

	public static void main(String[] args) {
		int temp = longestPeak(new int[] {1,1,3,2,1});
	
			System.out.println(temp);
	
	}

}
