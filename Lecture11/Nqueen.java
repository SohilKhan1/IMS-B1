package Lecture11;

import java.util.Arrays;

public class Nqueen {
 
	public static void main(String[] args) {
		int n = 4;
		char[][] board = new char[n][n];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = '.';
			}
		}
		solve(board, 0, 0);
	}

	private static void solve(char[][] board, int row, int col) {
		if (col == board.length) {
			row = row + 1;
			col = 0;
		}
		if (row == board.length) {
			for (char[] a : board) {
				System.out.println(Arrays.toString(a));
			}
			System.out.println("-------------");
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (canPlace(board, row, i)) {
				board[row][i] = 'Q';
				solve(board, row + 1, col);
				board[row][i] = '.';
			}
		}
	}

	private static boolean canPlace(char[][] board, int row, int col) {
		// for row
		for (int i = 0; i < board.length; i++) {
			if (board[row][i] == 'Q') {
				return false;
			}
		}
//		check for col
		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == 'Q') {
				return false;
			}
		}

//		for ULD
		int r = row;
		int c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c] == 'Q') {
				return false;
			}
			r--;
			c--;
		}
//		for URD
		r = row;
		c = col;
		while (r >= 0 && c < board.length) {
			if (board[r][c] == 'Q') {
				return false;
			}
			r--;
			c++;
		}

		return true;
	}

}
