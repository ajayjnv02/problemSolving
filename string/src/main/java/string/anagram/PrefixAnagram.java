package string.anagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Length of longest prefix anagram which are common in given two strings
 * 
 * @author eaukjam
 *
 */
public class PrefixAnagram {

	public static void main(String[] args) {
		String str1 = "abaabcdezzwer";
		String str2 = "caaabbttyh";

		// Function Call
		System.out.println(longCommomPrefixAnagram(str1, str2));
	}

	private static int longCommomPrefixAnagram(String str1, String str2) {

		Map<Character, Integer> charVsPrime = charVsPrime(); // o(1) time doesn't vary with input string length
		int n = str1.length();
		int m = str2.length();

		int hash1 = 1;
		int hash2 = 1;
		// o(n)
		for (int i = 0; i < str1.length(); i++) {

			if (i < m && i < n) {
				char c1 = str1.charAt(i);
				char c2 = str2.charAt(i);
				hash1 = charVsPrime.get(str1.charAt(i)) * hash1;
				hash2 = charVsPrime.get(str2.charAt(i)) * hash2;
				if (hash1 == hash2) {
					return ++i;
				}

			} else {
				return -1;
			}

		}
		return -1;
	}

	private static Map<Character, Integer> charVsPrime() {
		Map<Character, Integer> charVsPrime = new HashMap<>();
		List<Integer> primes = sieveOfEratosthenes(115);
		int i = 0;
		for (char c = 'a'; c <= 'z'; ++c) {
			charVsPrime.put(c, primes.get(i));
			i++;
		}
		return charVsPrime;
	}

	/**
	 * Calculate prime numbers <br>
	 * https://www.geeksforgeeks.org/sieve-of-eratosthenes/
	 * 
	 * @param n
	 * @return
	 */
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
}
