package array;

import java.util.*;

class ValidateSubSequence {
	public static int[] sortedSquaredArray(int[] array) {
		int min = 0;
		int max = array.length - 1;
		int j = array.length - 1;
		int[] sortedSquare = new int[array.length];
		
		
		while (min <= max) {
			if (Math.abs(array[min]) > Math.abs(array[max])) {

				sortedSquare[j] = array[min] * array[min];
				min++;
				j--;
			} else {

				sortedSquare[j] = array[max] * array[max];
				max--;
				j--;
			}
		}
		return sortedSquare;
	}
	public static void main(String[] args) {
		 int[] temp=sortedSquaredArray(new int[] {1,2,3,4,5,6});
		 for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
