package Lecture10;

public class minPathSum {
	public static void main(String[] args) {
		int[][] board = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		solve(board, 0, 0, "", board[0][0]);
	}

	private static void solve(int[][] board, int row, int col, String ans, int sum) {
		if (row == board.length - 1 && col == board[0].length - 1) {
			// System.out.println(ans);
			System.out.println(sum);
			return;
		}
		if (row < board.length - 1)
			solve(board, row + 1, col, ans + "V", sum + board[row][col]);

		if (col < board[0].length - 1)
			solve(board, row, col + 1, ans + "H", sum + board[row][col]);

	}
}
