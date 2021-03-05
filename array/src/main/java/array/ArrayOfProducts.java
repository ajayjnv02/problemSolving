package array;

import java.util.*;

class ArrayOfProducts {
	public static int[] arrayOfProducts(int[] array) {

		int[] productArray = new int[array.length];
		Arrays.fill(productArray, 1);
		int leftRunningProduct = 1;
		for (int i = 1; i < array.length; i++) {
			productArray[i] = leftRunningProduct * array[i - 1];
			leftRunningProduct= leftRunningProduct*array[i-1];
		}
		int rightRunningProduct = 1;
		for (int i = array.length - 1; i > 0; i--) {
			int temp = productArray[i];
			productArray[i] = temp * rightRunningProduct;

			rightRunningProduct = rightRunningProduct * array[i];
		}
		return productArray;
	}

	public static void main(String[] args) {
		 arrayOfProducts(new int[] {5, 1, 4, 2});
	}
}
