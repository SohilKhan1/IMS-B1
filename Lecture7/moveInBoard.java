package Lecture7;

public class moveInBoard {
	public static void main(String[] args) {
		int[][] board = new int[3][3];
		solve(board, 0, 0, "");
	}

	private static void solve(int[][] board, int row, int col, String ans) {
		if (row == board.length - 1 && col == board[0].length - 1) {
			System.out.println(ans);
			return;
		}
		if (row < board.length - 1)
			solve(board, row + 1, col, ans + "V");

		if (col < board[0].length - 1)
			solve(board, row, col + 1, ans + "H");

//		if (row < board.length - 1 && col < board[0].length - 1) {
//			solve(board, row + 1, col + 1, ans + "RD");
//		}
//
//		if (row < board.length - 1 && col > 0) {
//			solve(board, row + 1, col - 1, ans + "LD");
//		}
	}
}
