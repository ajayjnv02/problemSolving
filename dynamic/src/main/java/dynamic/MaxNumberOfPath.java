package dynamic;

/**
 * 
 * 
 * Recursion Will do DP later
 * 
 * @author eaukjam
 *
 */
public class MaxNumberOfPath {
	/**
	 * Recursive Solution
	 * 
	 * @param width
	 * @param height
	 * @return
	 */
	public int numberOfWaysToTraverseGraphRecursion(int width, int height) {
		if (width == 1) {
			return 1;
		}
		if (height == 1) {
			return 1;
		}

		int widthSum = numberOfWaysToTraverseGraphRecursion(width - 1, height);
		int heightsum = numberOfWaysToTraverseGraphRecursion(width, height - 1);
		return widthSum + heightsum;
	}

	/**
	 * DP RPROACH 
	 * @param width
	 * @param height
	 * @return
	 */
	public int numberOfWaysToTraverseGraphDP(int width, int height) {
		int[][] numbeOfWay = new int[width + 1][height + 1];

		for (int i = 1; i < width + 1; i++) {
			for (int j = 1; j < height + 1; j++) {
				if (i == 1 || j == 1) {
					numbeOfWay[i][j] = 1;
				} else {
					int wayLeft = numbeOfWay[i][j - 1];
					int wayRight = numbeOfWay[i - 1][j];
					numbeOfWay[i][j] = wayLeft + wayRight;
				}
			}
		}
		return numbeOfWay[width][height];
	}
	
	
	/**
	 * Math aproach
	 * @param width
	 * @param height
	 * @return
	 */
	public int numberOfWaysToTraverseGraphMath(int width, int height) {
		
		int x= height-1;
		int y = width-1;
		int numerator = fact(x+y);
		int denom = fact(x)* fact(y);
		
		return numerator/denom;
	}
	
	
	static int fact(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * fact(n-1));    
		 }    
}
