package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3662/
 * 
 * @author eaukjam
 *
 */
public class StoreEncoding {
	public static int minimumLengthEncoding(String[] words) {

		Set<String> wordsSet = new HashSet<>(Arrays.asList(words));
		for (Iterator iterator = wordsSet.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
		}

	}

	public static void main(String[] args) {
		minimumLengthEncoding(new String[] { "time", "me", "bell" ,"me"});
	}

}