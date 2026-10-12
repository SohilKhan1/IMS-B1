package Lecture9;

import java.util.*;

public class combinationsum2 {
	public static void main(String[] args) {
		int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
		Arrays.sort(arr);
		int target = 8;
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		solve(arr, target, list, 0, ans);
		System.out.println(ans);

	}

	private static void solve(int[] arr, int target, List<Integer> list, int idx, List<List<Integer>> ans) {
		if (target == 0) {
//			System.out.println(list);
			ans.add(new ArrayList<Integer>(list));
			return;
		}

		for (int i = idx; i < arr.length; i++) {
			if (i > idx && arr[i] == arr[i - 1]) {
				continue;
			}
			if (target >= arr[i]) {
				list.add(arr[i]);
				solve(arr, target - arr[i], list, i + 1, ans);
				list.remove(list.size() - 1);
			}
		}
	}

}
