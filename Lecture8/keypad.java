package Lecture8;

public class keypad {
	static String[] arr = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		String digit = "23";
		solve(digit, "");
	}

	private static void solve(String digit, String ans) {
		if (digit.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = digit.charAt(0);
		String key = arr[ch - 48];
 
		for (int i = 0; i < key.length(); i++) {
			solve(digit.substring(1), ans + key.charAt(i));
		}

	}

}