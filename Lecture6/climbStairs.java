//package Lecture6;
//
//public class climbStairs {
//	static int count = 0;
//
//	public static void main(String[] args) {
//		int n = 3;
//		System.out.println(solve(3));
//		System.out.println(solve(n, ""));
//		solveGL(n);
//		System.out.println(count;);
//	}
//
//	private static void solveGL(int n) {
//		if (n == 0 || n == 1) {
//			count++;
//			return;
//		}
//		solveGL(n - 1);
//		solveGL(n - 2);
//
//	}
//
//	private static int solve(int n) {
//		if (n == 0 || n == 1) {
//			return 1;
//		}
//		int a = solve(n - 1);
//		int b = solve(n - 2);
//		return a + b;
//	}
//
//	private static int solve(int n, String path) {
//		if (n == 0) {
//			System.out.println(path);
//			return 1;
//		}
//		int a = solve(n - 1, path + 1);
//		int b = 0;
//		if (n >= 2)
//			b = solve(n - 2, path + 2);
//		return a + b;
//	}
//
//}
