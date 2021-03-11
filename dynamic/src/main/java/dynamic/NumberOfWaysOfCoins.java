package dynamic;

import java.util.Arrays;

public class NumberOfWaysOfCoins {

	public static int numberOfWaysToMakeChange(int sum, int[] arr) {

		int dp[] = new int[sum + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		return minCoinChange(sum, arr, dp);
	}

	private static int minCoinChange(int sum, int[] arr, int[] dp) {

		if (sum == 0)
			return sum;
		
		
		int ans= Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			
			if(sum-arr[i] >=0)
			{
				int subAns= 0;
				if(dp[sum-arr[i]] !=-1)
				{
					subAns= dp[sum-arr[i]];
				}
				
				else
				{
					subAns = minCoinChange(sum-arr[i], arr, dp);
				}
				if( subAns!=Integer.MAX_VALUE && subAns+1 < ans)
				{
					ans= subAns+1;
				}
				
			}
			
		}
		return dp[sum]= ans;
		
		
	}

	public static void main(String[] args) {

		int coins[] = {7,5,1}, sum = 18, n = 3;

		System.out.println(numberOfWaysToMakeChange(sum, coins));

	}
}