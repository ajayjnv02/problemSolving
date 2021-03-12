package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * https://www.algoexpert.io/questions/Generate%20Document
 * 
 * @author eaukjam
 *
 */
public class GenerateDocument {
	public static  boolean generateDocument(String characters, String document) {
		Map<Character, Integer> charMap = new HashMap<>();
		for (int i = 0; i < characters.length(); i++) {

			char s = characters.charAt(i);
			if (charMap.get(s) == null) {
				charMap.put(s, 1);
			}
			else
			{
				int count = charMap.get(s);
				charMap.put(s, ++count);
			}
		}

		for (int i = 0; i < document.length(); i++) {
			char s = document.charAt(i);
			if(charMap.get(s) == null || charMap.get(s) <=0)
			{
				return false;
				
			}
			int count = charMap.get(s);
			charMap.put(s, --count);
		
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		generateDocument("aheaolabbhb", "hello");
	}
}