package Lecture3;

public class firstBadVersion {
	public static void main(String[] args) {
		int n = 5;
		solve(n);
	}

	private static void solve(int n) {

		int lo = 1;
		int hi = n;

		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isBadVersion(mid) == true) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}

		System.out.println(ans);

	}

	private static boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}

}
