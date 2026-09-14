package Lecture5;

public class coinToss {
	public static void main(String[] args) {
		int n = 3;
		toss(n, "");
	}

	private static void toss(int n, String s) {
		if (n == 0) {
			System.out.println(s);
			return;
		}
		toss(n - 1, s + "H");
		toss(n - 1, s + "T");
	}

}
