package array;

import java.util.*;

class TwoNumberSum {
	public static int[] twoNumberSum(int[] array, int targetSum) {
		Hashtable<Integer, Integer> ht1 = new Hashtable<>();

		for (int i = 0; i < array.length; i++) {

			if (ht1.get(targetSum - array[i]) != null) {
				
				return new int[] { targetSum - array[i], array[i] };
			} else {
				ht1.put(array[i], i);
			}
		}

		return new int[0];
	}
	
	public static void main(String[] args) {
		 int[] temp=twoNumberSum(new int[] {3,5,-4,8,11,1,-1,6}, 10);
		 for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
