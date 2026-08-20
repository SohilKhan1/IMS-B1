package Lecture2;

import java.util.Iterator;

public class rainWater {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		//solve(arr);
		solveopt(arr);
	}

	private static void solveopt(int[] arr) {

		int left[] = new int[arr.length];
		left[0] = arr[0];
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}
		int right[] = new int[arr.length];
		right[right.length - 1] = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			right[i] = Math.max(arr[i], right[i + 1]);
		}

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			int h = arr[i];
			int lmax = left[i];
			int rmax = right[i];
			ans += Math.min(lmax, rmax) - h;
		}
		System.out.println(ans);

	}

	private static void solve(int[] arr) {

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			// left max
			int lmax = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				lmax = Math.max(lmax, arr[j]);
			}

			// right max
			int rmax = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				rmax = Math.max(rmax, arr[j]);
			}
			int water = Math.min(lmax, rmax) - arr[i];
			System.out.println(water);
			ans += water;

		}
		System.out.println(ans);

	}

}
