package Lecture5;

public class fibbonachi {
	public static void main(String[] args) {
		int n = 5;
		int ans = fib(n);
		System.out.println(ans);
	}
	private static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int a = fib(n - 1);
		int b = fib(n - 2);
		return a + b;
	}
}
