package dynamic;

/**
 * https://www.algoexpert.io/questions/Levenshtein%20Distance
 * 
 * Recursion Will do DP later
 * 
 * @author eaukjam
 *
 */
public class MinDistanceToEdit {

	public static int levenshteinDistance(String str1, String str2) {

		if (str1.length() == 0)
			return str2.length();
		if (str2.length() == 0)
			return str1.length();

		int m = str1.length();
		int n = str2.length();
		if (str1.charAt(m - 1) == str2.charAt(n - 1))
			return levenshteinDistance(replaceLastChar(str1), replaceLastChar(str2));
		else {
			return 1 + Math.min(levenshteinDistance(str1, replaceLastChar(str2)),
					Math.min(levenshteinDistance(replaceLastChar(str1), str2),
							levenshteinDistance(replaceLastChar(str1), replaceLastChar(str2))));
		}

	}

	private static String replaceLastChar(String s) {
		// TODO Auto-generated method stub
		return s.substring(0, s.length() - 1);
	}

	public static void main(String[] args) {
		System.out.println(levenshteinDistance("abc", "yabd"));
	}
}
