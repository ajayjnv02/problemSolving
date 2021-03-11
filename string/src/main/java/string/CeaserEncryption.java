package string;

/**
 * 
 * @author eaukjam
 *
 */
public class CeaserEncryption {
	public static String caesarCypherEncryptor(String str, int key) {
		int newKey = key % 26;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			sb.append((getNewChar(str.charAt(i), newKey)));
		}
		return sb.toString();
	}

	private static char getNewChar(char charAt, int newKey) {
		int newCode = charAt + newKey;

		return newCode <= 122 ? (char) newCode : (char) (96 + newCode % 122);
	}

	public static void main(String[] args) {
		System.out.println(caesarCypherEncryptor("ajay", 456));
	}
}