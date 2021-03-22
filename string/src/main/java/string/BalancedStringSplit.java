package string;

import java.util.Stack;

/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/submissions/
 * 
 * @author eaukjam
 *
 */
public class BalancedStringSplit {
	/**
	 * Balanced strings are those that have an equal quantity of 'L' and 'R'
	 * characters.
	 * 
	 * 
	 * @param s split it in the maximum amount of balanced strings.
	 * @return the maximum amount of split balanced strings.
	 */
	static public int balancedStringSplit(String s) {

		int count = 0;

		Stack<Character> container = new Stack<Character>();
		char prevChar = 'L';
		for (int i = 0; i < s.length(); i++) {
			if (container.size() == 0) {
				container.push(s.charAt(i));
				prevChar = s.charAt(i);
				count++;
				continue;
			}
			char top = container.pop();
			if (s.charAt(i) != top) {

			} else {
				container.push(top);
				container.push(s.charAt(i));
			}

		}

		return count;

	}

	public static void main(String[] args) {
		System.out.println(balancedStringSplit("rlrlrlrlrlrlrlrlrlrlrlrlrl"));
	}
}
