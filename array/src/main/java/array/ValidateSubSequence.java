package array;

import java.util.*;

class ValidateSubSequence {
	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		int seq_i = 0;

		for (int i = 0; i < array.size() && seq_i < sequence.size(); i++) {

			if (array.get(i).equals(sequence.get(seq_i))) {
				seq_i++;
			}

		}
		if (seq_i == sequence.size()) {
			return true;
		}
		return false;
	}

}
