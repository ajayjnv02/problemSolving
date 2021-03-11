package array;

import java.util.Arrays;

/**
 * 
 * @author eaukjam
 *
 */
public class NonCounstructibleChange {
	/**
	 * Return minimum amount of change that can't be created using given set of int
	 * coins
	 * 
	 * @param coins
	 * @return
	 */
	public int nonConstructibleChange(int[] coins) {
		// Write your code here.
		Arrays.sort(coins);
		int change = 0;
		for (int i = 0; i < coins.length; i++) {

			if (coins[i] > change + 1) {
				return change + 1;

			}
			change = change + coins[i];
		}
		return change + 1;
	}
}
