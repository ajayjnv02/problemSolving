package greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
 * 
 * @author eaukjam
 *
 */
public class GroupThePeople {

	static public List<List<Integer>> groupThePeople(int[] groupSizes) {
		List<List<Integer>> groupOfPeople = new ArrayList<>();

		Map<Integer, List<List<Integer>>> sizeVsList = new HashMap<>();
		for (int i = 0; i < groupSizes.length; i++) {

			if (sizeVsList.containsKey(groupSizes[i])) {
				List<List<Integer>> temp = sizeVsList.get(groupSizes[i]);

				if (temp.get(temp.size() - 1).size() < groupSizes[i]) {
					temp.get(temp.size() - 1).add(i);
				} else {
					List<Integer> list = new ArrayList<>();
					list.add(i);
					temp.add(list);
				}
			} else {
				List<List<Integer>> temp = new ArrayList<>();
				List<Integer> list = new ArrayList<>();
				temp.add(list);
				list.add(i);
				sizeVsList.put(groupSizes[i], temp);
			}

		}
		Iterator<Integer> it = sizeVsList.keySet().iterator();
		while (it.hasNext()) {
			List<List<Integer>> list = sizeVsList.get(it.next());
			for (int i = 0; i < list.size(); i++) {

				groupOfPeople.add(list.get(i));
			}
		}
		return groupOfPeople;
	}

	public static void main(String[] args) {
		System.out.println(groupThePeople(new int[] { 3, 3, 3, 3, 3, 1, 3 }));
	}
}
