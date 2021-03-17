package string;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author eaukjam
 *
 */
public class SuperPalinDrome {

	public static int superpalindromesInRange(String left, String right) {

		int i = 0;
		long rightNum = Long.parseLong(right);
		long leftNum = Long.parseLong(left);

		Map<Long, Boolean> numToPalindromMap = new HashMap<Long, Boolean>();
		for (long j = rightNum; j >= leftNum; j--) {

			double sqrtj = Math.sqrt(j);
			long longsqrtj = (long) Math.sqrt(j);
			if (longsqrtj == sqrtj) {

				if (((numToPalindromMap.get(j) != null && numToPalindromMap.get(j).booleanValue())
						|| isPalinDrome(j, numToPalindromMap))
						&& ((numToPalindromMap.get(j) != null && numToPalindromMap.get(j).booleanValue())
								|| isPalinDrome(longsqrtj, numToPalindromMap))) {

					numToPalindromMap.put(j, true);
					numToPalindromMap.put(longsqrtj, true);
					i++;
				} else {
					numToPalindromMap.put(j, false);
					numToPalindromMap.put(longsqrtj, false);
				}
			}
		}
		return i;

	}

	public static boolean isPalinDrome(long num, Map<Long, Boolean> numToPalindromMap) {
		long r, sum = 0, temp;
		temp = num;
		while (num > 0) {
			r = num % 10; // getting remainder
			sum = (sum * 10) + r;
			num = num / 10;
		}
		return temp == sum;
	}

	public static void main(String[] args) {
		System.out.println(superpalindromesInRange("4", "1000"));
	}
}
