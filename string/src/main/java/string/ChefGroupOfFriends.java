package string;

import java.util.Scanner;

/**
 * https://www.codechef.com/MARCH21C/problems/NOTIME
 * 
 * @author eaukjam
 *
 */
public class ChefGroupOfFriends {
	public static void main(String[] args) throws java.lang.Exception {
		try {
			Scanner sc = new Scanner(System.in);
			int count = sc.nextInt();
			for (int i = 0; i < count; i++) {
				int groupCount = 0;
				String group = sc.nextLine();
				for (int j=0;j< group.length();j++)
				{
					int bit= Character.getNumericValue(group.charAt(j));
					if(bit == 0)
					{
						
					}
				}

			}

		} catch (Exception e) {
		}
	}
}