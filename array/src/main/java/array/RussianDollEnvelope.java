package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * You are given a 2D array of integers envelopes where envelopes[i] = [wi, hi]
 * represents the width and the height of an envelope.
 * 
 * One envelope can fit into another if and only if both the width and height of
 * one envelope is greater than the width and height of the other envelope.
 * 
 * Return the maximum number of envelopes can you Russian doll (i.e., put one
 * inside the other).
 * 
 * Note: You cannot rotate an envelope.
 * 
 * @author eaukjam
 *
 */
public class RussianDollEnvelope {
	public static int maxEnvelopes(int[][] envelopes) {
		int count = 0;
		Arrays.sort(envelopes, Comparator.comparingInt(o -> o[0]));
		Arrays.sort(envelopes, Comparator.comparingInt(o -> o[1]));
		int[] pre = envelopes[0];

		for (int i = 1; i < envelopes.length; i++) {
			if (pre[0] < envelopes[i][0] && pre[1] < envelopes[i][1]) {

				count++;
				pre = envelopes[i];
			}

		}
		return count+1;
	}

	public static void main(String[] args) {
		/*
		 * int[][] size = new int[][] { { 5, 4 },{2,4}, { 6, 4 }, { 6, 7 }, { 2, 3 } };
		 * maxEnvelopes(size);
		 * 
		 */
	String s1= "yes";
	String s2= "yes";
	String s3= new String(s1);
	
	System.out.println(s1==s2);
	}
}
