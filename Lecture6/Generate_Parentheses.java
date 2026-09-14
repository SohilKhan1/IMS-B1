package Lecture6;

public class Generate_Parentheses {
	public static void main(String[] args) {
		int n = 2;
		solve(n, 0, 0, "");
	}

	private static void solve(int n, int open, int close, String str) {
		if (open == n && close == n) {
			System.out.println(str);
			return;
		}
		if (open < n)
			solve(n, open + 1, close, str + "(");
		if (close < open)
			solve(n, open, close + 1, str + ")");
	}
}
