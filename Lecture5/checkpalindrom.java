package Lecture5;

public class checkpalindrom {
	public static void main(String[] args) {
		String s = "nitin";
		boolean ans = ispalindrom(s);
		System.out.println(ans);
	}

	private static boolean ispalindrom(String s) {
		int st = 0;
		int ed = s.length() - 1;
		while (st < ed) {
			if (s.charAt(st) != s.charAt(ed)) {
				return false;
			}
			st++;
			ed--;
		}

		return true;
	}

}
