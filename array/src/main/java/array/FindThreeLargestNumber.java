package array;

import java.util.*;

class FindThreeLargestNumber {
	public static int[] findThreeLargestNumbers(int[] array) {

		List<Integer> largestList = new ArrayList<Integer>();
		largestList.add(array[0]);
		largestList.add(array[1]);
		largestList.add(array[2]);
		for(int i =3;i< array.length;i++)
		{
			int element= array[i];
			if(largestList.stream().anyMatch(num -> element > num))
			{
				largestList.forEach(t -> {
					if(element >t)
					{
						largestList.set(largestList.indexOf(t),element);
					}
				});
				
			}
		}
		Collections.sort(largestList);
		return new int[] {largestList.get(0),largestList.get(1),largestList.get(2)};
	}

	public static void main(String[] args) {
		int[] temp = findThreeLargestNumbers(new int[] { 1, 2, 3, 4, 5, 6 });

	}
}
