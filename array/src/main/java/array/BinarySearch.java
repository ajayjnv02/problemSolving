package array;

import java.util.*;

public class BinarySearch {
	public static int binarySearch(int[] array, int target) {

		return binarySearchRecuRsive(array, 0, array.length - 1, target);

	}

	public static int binarySearchRecuRsive(int[] array, int lb, int ub, int target) {
		if (lb <= ub) {

			int mid = (ub + lb) / 2;

			if (array[mid] == target) {
				return mid;
			}
			if (array[mid] < target) {
				return binarySearchRecuRsive(array, mid + 1, ub, target);
			}
			if (array[mid] > target) {
				return binarySearchRecuRsive(array, lb, mid - 1, target);
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		System.out.println(binarySearch(new int[] {0,1,21,33,45,61,71,72,73}, 33));
	}
}
