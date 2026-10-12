package Lecture11;

public class wordSearch {
	public static void main(String[] args) {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "FCED";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == word.charAt(0))
					System.out.println(solve(board, i, j, word, 1));
			}
		}
	}

	private static boolean solve(char[][] board, int row, int col, String word, int idx) {
		if (idx == word.length()) {
			return true;
		}
		int[] r = { -1, 0, 0, 1 };
		int[] c = { 0, 1, -1, 0 };

		boolean flag = false;
		for (int i = 0; i < 4; i++) {

			int nr = row + r[i];
			int nc = col + c[i];
			if (nr >= 0 && nc >= 0 && nr < board.length && nc < board[0].length) {
				if (board[nr][nc] == word.charAt(idx))
					flag = solve(board, nr, nc, word, idx + 1);
			}
		}
		return flag;

	}

}
