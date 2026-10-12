package Lecture10;

public class MoveInBoard {
	public static void main(String[] args) {

		int[][] board = new int[3][3];
		solve(board, 0, 0, "");
	}

	private static void solve(int[][] board, int row, int col, String ans) {
		if (row == board.length - 1 && col == board[0].length - 1) {
			System.out.println(ans);
			return;
		}
		if (row < board.length - 1) {
			if (board[row + 1][col] == 0) {
				board[row + 1][col] = 1;
				solve(board, row + 1, col, ans + "D");
				board[row + 1][col] = 0;
			}
		}

		if (col < board[0].length - 1) {
			if (board[row][col + 1] == 0) {
				board[row][col + 1] = 1;
				solve(board, row, col + 1, ans + "R");
				board[row][col + 1] = 0;
			}
		}

		if (col > 0) {
			if (board[row][col - 1] == 0) {
				board[row][col - 1] = 1;
				solve(board, row, col - 1, ans + "L");
				board[row][col - 1] = 0;
			}
		}

		if (row > 0) {
			if (board[row - 1][col] == 0) {
				board[row - 1][col] = 1;
				solve(board, row - 1, col, ans + "U");
				board[row - 1][col] = 0;
			}
		}
	}
}
