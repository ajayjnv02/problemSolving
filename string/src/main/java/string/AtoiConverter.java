package string;

public class AtoiConverter {
	public int myAtoi(String s) {
		int number = 0;
		s.trim();
		String[] temp = s.split(" ");
		String needsToBeConverted = temp[0].replaceFirst("^0+(?!$)", "");
		boolean isNegative = false;
		if (!("".equals(needsToBeConverted)) && needsToBeConverted.charAt(0) == '-') {
			isNegative = true;
		}
		if (isNegative) {
			needsToBeConverted.replaceFirst("-", "");
			number = Integer.parseInt(needsToBeConverted);
			if (number < 2147483648) {

			}
		}
		return 0;
	}
}
