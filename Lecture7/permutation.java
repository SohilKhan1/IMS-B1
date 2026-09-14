package Lecture7;

public class permutation {

	public static void main(String[] args) {
		String str = "abc";
		solve(str, "");

	}

	private static void solve(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			ans = ans + str.charAt(i);
			solve(str.substring(0, i) + str.substring(i + 1), ans );
			ans=ans.substring(0,ans.length()-1);
		}

	}

}
