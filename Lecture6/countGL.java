package Lecture6;

public class countGL {
	static int count = 0;

	public static void main(String[] args) {
		int n = 3;
		solveGL(n);
		System.out.println(count);
	}

	private static void solveGL(int n) {
		if (n == 0 || n == 1) {
			count++;
			return;
		}
		solveGL(n - 1);
		solveGL(n - 2);
	}
}
