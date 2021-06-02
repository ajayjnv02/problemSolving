package array;

/**
 * https://leetcode.com/explore/challenge/card/june-leetcoding-challenge-2021/603/week-1-june-1st-june-7th/3764/
 * 
 * @author eaukjam
 *
 */
public class MaxAreaOfIsland {

	public int maxAreaOfIsland(int[][] grid) {

		boolean[][] isVisited = new boolean[grid.length][grid[0].length];

		int max = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {

				if (grid[i][j] == 1 && !isVisited[i][j]) {
					int temp = calculateArea(grid, i, j, isVisited);
					if (max < temp) {
						max = temp;
					}
				}
			}
		}

		return max;
	}

	private int calculateArea(int[][] grid, int i, int j, boolean[][] isVisited) {

		if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1 || grid[i][j] == 0 || isVisited[i][j]) {
			return 0;
		}

		isVisited[i][j] = true;

		return 1 + calculateArea(grid, i + 1, j, isVisited) + calculateArea(grid, i, j + 1, isVisited)
				+ calculateArea(grid, i - 1, j, isVisited) + calculateArea(grid, i, j - 1, isVisited);

	}

	public static void main(String[] args) {
		int[][] grid = new int[][] { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };

		new MaxAreaOfIsland().maxAreaOfIsland(grid);
	}

}
