package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author eaukjam
 *
 */
public class AnagramTest {
	/**
	 * Group the anagaram in a list of strings {@code E.g. } ["yo", "act", "flop",
	 * "tac", "foo", "cat", "oy", "olfp" ] will get grouped as below<br>
	 * [[act, tac, cat],<br>
	 * [flop, olfp],<br>
	 * [foo], <br>
	 * [yo, oy]]
	 * 
	 * @param words
	 * @return
	 */
	public static List<List<String>> groupAnagrams(List<String> words) {
		List<Integer> primes = sieveOfEratosthenes(115);
		Map<Character, Integer> charVsPrime = new HashMap<>();

		int i = 0;
		for (char c = 'a'; c <= 'z'; ++c) {
			charVsPrime.put(c, primes.get(i));
			i++;
		}
		Map<Integer, List<String>> hashCodeVsListOfString = new HashMap<Integer, List<String>>();
		words.forEach((word) -> {
			int hashCode = calculateHash(word, charVsPrime);
			if (hashCodeVsListOfString.get(hashCode) != null) {
				hashCodeVsListOfString.get(hashCode).add(word);
			} else {
				List<String> newList = new LinkedList<>();
				newList.add(word);
				hashCodeVsListOfString.put(hashCode, newList);

			}
		});
		List<List<String>> returnListy = new ArrayList<List<String>>();

		hashCodeVsListOfString.forEach((k, v) -> {
			returnListy.add(v);
		});
		return returnListy;
	}

	private static int calculateHash(String word, Map<Character, Integer> charVsPrime) {

		int hashCode = 1;
		for (int i = 0; i < word.length(); i++) {
			hashCode = hashCode * charVsPrime.get(word.charAt(i));

		}
		return hashCode;

	}

	public static List<Integer> sieveOfEratosthenes(int n) {
		boolean prime[] = new boolean[n + 1];
		Arrays.fill(prime, true);
		for (int p = 2; p * p <= n; p++) {
			if (prime[p]) {
				for (int i = p * 2; i <= n; i += p) {
					prime[i] = false;
				}
			}
		}
		List<Integer> primeNumbers = new LinkedList<>();
		for (int i = 2; i <= n; i++) {
			if (prime[i]) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}

	public static void main(String[] args) {
		System.out.println(
				groupAnagrams(Arrays.asList(new String[] { "yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp" })));
	}
}
