package Lecture9;

import java.util.*;

public class combinations {
	public static void main(String[] args) {
		int n = 4;
		int k = 2;
		int idx = 0;
		List<Integer> list = new ArrayList<>();
		solve(n, k, list, 1);
	}

	private static void solve(int n, int k, List<Integer> list, int idx) {

		if (list.size() == k) {
			System.out.println(list);
			return;
		}

		for (int i = idx; i <= n; i++) {
			list.add(i);
			solve(n, k, list, i + 1);
			list.remove(list.size() - 1);
		}

	}

}
