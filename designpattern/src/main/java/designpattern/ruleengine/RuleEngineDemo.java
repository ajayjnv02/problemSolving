package designpattern.ruleengine;

public class RuleEngineDemo {
	private static String wordstatic = "";

	public String[] spellchecker(String[] wordlist, String[] queries) {

		String[] spelledString = new String[queries.length];
		for (int i = 0; i < queries.length; i++) {

			if (!exactWordMatcher(queries[i], wordlist)) {
				if (!wordUpToCapitlilisation(queries[i], wordlist)) {
					if (!wordUpToVowelErrors(queries[i], wordlist)) {

					} else {
						spelledString[i] = "";
					}
				} else {
					spelledString[i] = wordstatic;
				}
			} else {
				spelledString[i] = queries[i];
			}
		}
		return spelledString;
	}

	private boolean wordUpToVowelErrors(String string, String[] wordlist) {
		for (String word : wordlist) {
			if (matchExceptVowel(word,string))
			{
				
			}

		}
		return false;
	}

	private boolean matchExceptVowel(String word1, String word2) {
		if(word1.length() != word2.length())
		{
			return false;
		}
		for (int i = 0; i < word1.length(); i++) {
			char char1 = word1.charAt(i);
			char char2 = word2.charAt(i);
			if(char1!= char2)
			{
				
			}
		}
		
		return false;
	}

	private boolean wordUpToCapitlilisation(String string, String[] wordlist) {
		for (String word : wordlist) {
			if (word.equalsIgnoreCase(string)) {
				wordstatic = word;
				return true;
			}
		}
		return false;
	}

	private boolean exactWordMatcher(String string, String[] wordlist) {

		for (String word : wordlist) {
			if (word.equals(string)) {
				return true;
			}
		}
		return false;
	}
}
