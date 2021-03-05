package string;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * https://www.codechef.com/MARCH21C/problems/NOTIME
 * 
 * @author eaukjam
 *
 */
public class NoTimeCodeChef {
	public static void main(String[] args) throws java.lang.Exception {
		try {
			Scanner inp = new Scanner(System.in);
			List<String> temp = Arrays.asList(inp.nextLine().split(" "));
			List<Integer> nhx = temp.stream().map(Integer::parseInt).collect(Collectors.toList());
			
			int hoursleft = nhx.get(1) - nhx.get(2);
			temp = Arrays.asList(inp.nextLine().split(" "));
			nhx = temp.stream().map(Integer::parseInt).collect(Collectors.toList());

			for (Iterator iterator = nhx.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				if (hoursleft <=integer ) {
					System.out.println("yes");
					return;
				}
			}

			System.out.println("no");
		} catch (Exception e) {
		}
	}
}