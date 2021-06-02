package dynamic;

/**
 * https://leetcode.com/problems/ones-and-zeroes/
 * 
 * @author eaukjam
 *
 */
public class ZerosAndOnes {
	public static int findMaxForm(String[] strs, int m, int n) {

		int dp[][] = new int[m + 1][n + 1];

		for (String str : strs) {

			int ones = 0;
			for (int i = 0; i < str.length(); i++) {
				ones += Character.getNumericValue(str.charAt(i));

			}
			int zeroes = str.length() - ones;
			for (int i = m; i >= zeroes; i--) {

				for (int j = n; j >= ones; j--) {

					dp[i][j] = Math.max(dp[i][j], 1 + dp[i - zeroes][j - ones]);
				}
			}
		}

		return maxIn2DArray(dp);

	}

	private static int maxIn2DArray(int[][] dp) {
		int max = 0;
		for (int[] col : dp) {
			for (int row : col) {

				max = Math.max(max, row);

			}
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		
		findMaxForm(new String [] {"10","0001","111001","1","0"}, 5, 3);
	}
}
