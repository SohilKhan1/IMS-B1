package Lecture8;

import java.util.*;

public class combSum {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 6,7 };
		int target = 7;
		List<Integer> list = new ArrayList<>();
		solve(arr, target, list);

	}

	private static void solve(int[] arr, int target, List<Integer> list) {
		if (target == 0) {
			System.out.println(list);
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (target >= arr[i]) {
				list.add(arr[i]);
				solve(arr, target - arr[i], list);
				list.remove(list.size() - 1);
			}
		}
	}

}
