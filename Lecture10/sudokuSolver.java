package Lecture10;

import java.util.Arrays;

public class sudokuSolver {
	public static void main(String[] args) {

		int[][] board = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0 }, { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
				{ 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 }, { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
				{ 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 }, { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };
		solve(board, 0, 0);

	}

	private static void solve(int[][] board, int row, int col) {
		if (col == 9) {
			col = 0;
			row = row + 1;
		}
		if (row == 9) {
			for (int[] a : board) {
				System.out.println(Arrays.toString(a));
			}
			return;
		}
		if (board[row][col] != 0) {
			solve(board, row, col + 1);
		} else {

			for (int val = 1; val <= 9; val++) {
				if (canWePlace(board, row, col, val) == true) {
					board[row][col] = val;
					solve(board, row, col + 1);
					board[row][col] = 0;
				}
			}
		}
	}

	private static boolean canWePlace(int[][] board, int row, int col, int val) {

//		check for row
		for (int i = 0; i < board.length; i++) {
			if (board[row][i] == val) {
				return false;
			}
		}
//		check for col
		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == val) {
				return false;
			}
		}

//		check for 3*3 matrix 
		int r = row - row % 3;
		int c = col - col % 3;

		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (board[i][j] == val) {
					return false;
				}
			}
		}

		return true;
	}

}
