package array;

import java.util.*;

class DuplicateValues {
	/**
	 * return 1st duplicate values in an array of size n that contains integer in
	 * range 1 to n
	 * 
	 * @param array
	 * @return
	 */
	public static int firstDuplicateValue(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int index = Math.abs(array[i]) - 1;
			if (array[index] < 0) {
				return Math.abs(index + 1);
			}
			array[index] = (array[index]) * (-1);
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(firstDuplicateValue(new int[] { 2, 1, 5, 2, 3, 3, 4 }));

	}
}
