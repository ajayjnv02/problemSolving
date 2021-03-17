package array;

import java.util.Arrays;

/**
 * https://www.algoexpert.io/questions/Smallest%20Difference
 * 
 * @author eaukjam
 *
 */
public class SmallestDifference {

	/**
	 * Return the pair with least absolute difference
	 * 
	 * @param arrayOne
	 * @param arrayTwo
	 * @return
	 */
	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {

		Arrays.parallelSort(arrayOne);
		Arrays.parallelSort(arrayTwo);
		int i = 0, j = 0;
		int smallest = Integer.MAX_VALUE;
		int current = Integer.MAX_VALUE;
		int[] smallestPair = new int[2];
		while (i < arrayOne.length && j < arrayTwo.length) {
			if (arrayOne[i] - arrayTwo[j] == 0) {
				return new int[] { arrayOne[i], arrayTwo[j] };
			}

			int first = arrayOne[i];
			int second = arrayTwo[j];
			if (arrayOne[i] < arrayTwo[j]) {

				current = arrayTwo[j] - arrayOne[i];
				i++;
			} else {
				current = arrayOne[i] - arrayTwo[j];
				j++;
			}

			if (smallest > current) {
				smallest = current;
				smallestPair = new int[] { first, second };
			}

		}

		return smallestPair;
	}
}
