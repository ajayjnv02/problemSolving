package string;

public class LongestPalindromeSubString {
	public static void main(String[] args) {

		System.out.println(longestPalindromicSubstring("z234a5abbba54a32z"));
	}

	public static String longestPalindromicSubstring(String str) {

		int length = -1;
		String palindromSrting = "";
		for (int i = 0; i < str.length(); i++) {

			String palindrome="";
			String palindromeLeft = findPalindromeAroundIndexLeft(i, str);
			String palindromeRight =findPalindromeAroundIndexRight(i,str);
			if(palindromeLeft.length() > palindromeRight.length())
			{
				palindrome = palindromeLeft;
			}
			else
			{
				palindrome = palindromeRight;
			}
			if (length < palindrome.length()) {
				palindromSrting = palindrome;
				length = palindrome.length();
			}
		}

		return palindromSrting;
	}

	private static String findPalindromeAroundIndexLeft(int i, String str) {
		if (i - 1 >= 0 && str.charAt(i) == str.charAt(i - 1)) // even length palindrome
		{
			return palindrome(i - 1, i, str);

		} else if (i + 1 < str.length() && str.charAt(i + 1) == str.charAt(i))// even length palindrome
		{
			return palindrome(i, i + 1, str);

		} else if ((i + 1 < str.length() && i - 1 >= 0) && (str.charAt(i + 1) == str.charAt(i - 1))) // Odd lenght
																										// palindrome
		{

			return palindrome(i - 1, i + 1, str);

		}

		return "" + str.charAt(i);
	}

	private static String findPalindromeAroundIndexRight(int i, String str) {
		if ((i + 1 < str.length() && i - 1 >= 0) && (str.charAt(i + 1) == str.charAt(i - 1))) // Odd lenght
																								// palindrome
		{

			return palindrome(i - 1, i + 1, str);

		} else if (i - 1 >= 0 && str.charAt(i) == str.charAt(i - 1)) // even length palindrome
		{
			return palindrome(i - 1, i, str);

		} else if (i + 1 < str.length() && str.charAt(i + 1) == str.charAt(i))// even length palindrome
		{
			return palindrome(i, i + 1, str);

		}

		return "" + str.charAt(i);
	}

	private static String palindrome(int l, int r, String str) {

		while (r < str.length() && l >= 0 && (str.charAt(l) == str.charAt(r))) {

			l--;
			r++;
		}
		return str.substring(l + 1, r);
	}
}
