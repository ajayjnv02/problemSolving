package array;

/**
 * 
 * @author eaukjam
 *
 */
class NonDecreasingArray {

	public static boolean checkPossibility(int[] a) {

		int onefound = 0;
		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] > a[i + 1]) {

				System.out.println(a[i] + "  " + a[i + 1]);
				if (onefound == 0) {
					onefound = 1;
				} else {
					return false;
				}

			}
		}
		return true;
	}

	public static int divide(int dividend, int divisor) {
		int i = 0;
	
		int remainder = Math.abs(dividend);
		int absDivisor = Math.abs(divisor);
		
		while (remainder >= absDivisor) {

			remainder = remainder - absDivisor;
			i++;
		}

		if((dividend <0 && divisor <0) || (dividend >0 && divisor >0))
		{
		return i;
		}
		else 
			return -1*i; 
	}

	public static void main(String[] args) {

		
		System.out.println(divide(-2147483647,
				-1));
	}
}
