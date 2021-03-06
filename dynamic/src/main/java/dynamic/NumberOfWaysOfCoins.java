package dynamic;

public class NumberOfWaysOfCoins {

	public static int numberOfWaysToMakeChange(int sum, int[] denoms) {

		int n = denoms.length;
		int dp[][] = new int[sum + 1][n + 1];

		for (int i = 0; i <= n; i++) {
			dp[0][i] = 1;
		}

		for (int i = 1; i <= sum; i++) {
			for (int j = 1; j <= n; j++) {
				dp[i][j] = dp[i][j - 1];

				if (denoms[j - 1] <= i)
					dp[i][j] += dp[i - denoms[j - 1]][j];
			}
		}

		return dp[sum][n];

	}

	public static void main(String[] args) {

		int coins[] = { 1, 2, 3 }, sum = 4, n = 3;

		System.out.println(numberOfWaysToMakeChange(sum, coins));

	}
}