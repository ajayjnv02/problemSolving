package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Check If a String Contains All Binary Codes of Size K
 * 
 * {@linkplain https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/ }
 * 
 * @author eaukjam
 *
 */
public class Solution {
	public static boolean hasAllCodes(String s, int k) {

		return findAllSubStringOfSizeK(s, k).size() == Math.pow(2, k);
	}

	static Set<String> findAllSubStringOfSizeK(String s, int k) {

		Set<String> uniqueSubString = new HashSet<String>();
		for (int i = 0; i <= s.length() - k; i++) {
			String substr = s.substring(i, i + k);
			if (substr.matches("[0-1]+")) {
				uniqueSubString.add(substr);
			}
		}
		return uniqueSubString;
	}

	public static void main(String[] args) {
		hasAllCodes("00110110", 2);
	}
}