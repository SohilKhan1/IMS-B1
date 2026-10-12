package Lecture12;

import java.util.*;

public class RatInMaze {
	public static void main(String[] args) {
		int[][] maze = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
		System.out.println(findPath(maze, maze.length));
	}

	public static ArrayList<String> findPath(int[][] maze, int n) {
		ArrayList<String> result = new ArrayList<>();
		boolean[][] visited = new boolean[n][n];

		if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
			return result;
		}

		solve(maze, 0, 0, n, "", visited, result);
		Collections.sort(result);
		return result;
	}

	public static void solve(int[][] maze, int row, int col, int n, String path, boolean[][] visited,
			ArrayList<String> result) {
		if (row == n - 1 && col == n - 1) {
			result.add(path);
			return;
		}

		visited[row][col] = true;

		int[] dr = { 1, 0, 0, -1 };
		int[] dc = { 0, -1, 1, 0 };
		char[] dir = { 'D', 'L', 'R', 'U' };

		for (int i = 0; i < 4; i++) {
			int newRow = row + dr[i];
			int newCol = col + dc[i];

			if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && maze[newRow][newCol] == 1
					&& !visited[newRow][newCol]) {

				solve(maze, newRow, newCol, n, path + dir[i], visited, result);
			}
		}

		visited[row][col] = false;
	}

}