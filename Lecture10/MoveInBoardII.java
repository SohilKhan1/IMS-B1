package Lecture10;

public class MoveInBoardII {
	public static void main(String[] args) {

		int[][] board = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		solve(board, 0, 0, "");
	}

	private static void solve(int[][] board, int row, int col, String ans) {
		if (row == board.length - 1 && col == board[0].length - 1) {
			System.out.println(ans);
			return;
		}

		int[] r = { -1, 0, 0, 1 };
		int[] c = { 0, 1, -1, 0 };

		for (int i = 0; i < r.length; i++) {

			int nrow = row + r[i];
			int ncol = col + c[i];

			if (nrow >= 0 && ncol >= 0 && nrow <= board.length - 1 && ncol <= board[0].length - 1) {
				if (board[nrow][ncol] != 0) {
					int value = board[nrow][ncol];
					board[nrow][ncol] = 0;
					solve(board, nrow, ncol, ans + value + "-->");
					board[nrow][ncol] = value;
				}
			}

		}

	}
}
