package Lecture2;

import java.util.Arrays;

public class nextPermutation {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1 };
		solve(arr);
	}

	private static void solve(int[] arr) {
//		step 1 find p
		int p = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] > arr[i - 1]) {
				p = i - 1;
				break;
			}
		}
//		step 2 find q 
		int q = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				break;
			}
		}
		if (p == q) {
			reverse(arr, 0, arr.length - 1);
			return;
		}

//		step 3 swap p&q
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;

//		step 4 revrse left array from p+1
		reverse(arr, p + 1, arr.length - 1);

	}

	private static void reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

}
