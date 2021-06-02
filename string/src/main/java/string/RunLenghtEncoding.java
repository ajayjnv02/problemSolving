package string;

public class RunLenghtEncoding {
	public static String runLengthEncoding(String string) {

		StringBuffer sb = new StringBuffer();
		char charCounting = string.charAt(0);
		int count = 1;
		for (int i = 1; i < string.length(); i++) {

			if (charCounting != string.charAt(i)) {
				sb.append("" + count);
				sb.append(charCounting);
				count = 0;
			}

			charCounting = string.charAt(i);
			count++;

			if (count == 9) {
				sb.append("" + count);
				sb.append(charCounting);
				count = 1;
				charCounting = string.charAt(++i);

			}
		}
		sb.append("" + count);
		sb.append(charCounting);
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(runLengthEncoding("........______=========AAAA   AAABBBB   BBB"));
	}
}
