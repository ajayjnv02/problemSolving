package dynamic;

/**
 * https://leetcode.com/problems/longest-valid-parentheses/
 * https://www.youtube.com/watch?v=uPHXjpdAJ_I
 * 
 * @author eaukjam <br>
 * 
 *
 */
public class LongestValidParenthesis {

	public int longestValidParentheses(String s) {
		int max = 0;
		int longest[] = new int[s.length()];
		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ')') {
				if (i - longest[i - 1] - 1 >= 0 && s.charAt(i - longest[i - 1] - 1) == '(') {

					longest[i] = longest[i - 1] + 2
							+ ((i - longest[i - 1] - 2 >= 0) ? longest[i - longest[i - 1] - 2] : 0);

				}
			}
			max = Math.max(max, longest[i]);
		}
		return max;
	}
}
