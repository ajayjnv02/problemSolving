package dynamic;

import java.util.*;

class SubsetSumNoAdjacent {
	
		  public static int maxSubsetSumNoAdjacent(int[] arr) {
			   
				if (arr.length == 0) {
					return 0;
				}
				if (arr.length == 1) {
					return arr[0];
				}
				int second = arr[0];
				int first = Math.max(second, arr[1]);

				for (int i = 2; i < arr.length; i++) {

					int current =Math.max(arr[i]+second, first);
					second=first;
					first=current;
				}
				return first;
			
		  }
}
