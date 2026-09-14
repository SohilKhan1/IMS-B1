package Lecture5;

public class factorial {
	public static void main(String[] args) {
		int n = 5;
		int ans = fact(n);
		System.out.println(ans);
	}

	private static int fact(int n) {
		if (n == 1) {
			return n;
		}
		int sp = fact(n - 1);
		int bp = sp * n;
		return bp;

	}

}
