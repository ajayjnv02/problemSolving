package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HalvesAreAlike {
	Set<Character> vowelSet = new HashSet<Character>();
	Map<Character, Integer> m1 = new HashMap<Character, Integer>();

	public boolean halvesAreAlike(String s) {
		vowelSet.addAll(Arrays.asList(new Character[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' }));
		String[] strings = s.split("(?<=\\G.{2})");
		String s1 = s.substring(0, (s.length() / 2));
		String s2 = s.substring((s.length() / 2), s.length());
		int vowelCount1 = countVowel(s1);
		int vowelCount2 = countVowel(s2);
		return vowelCount1 == vowelCount2;

	}

	private int countVowel(String s1) {
		int count = 0;

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (vowelSet.contains(c)) {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(new HalvesAreAlike().halvesAreAlike("dfgdgdf dfhdfghdfg dhfgjhfgjg"));
	}
}
