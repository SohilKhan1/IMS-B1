package Lecture3;

public class binarySearch {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7, 9, 11, 14, 16, 18, 23, 26 };
		int target = 9;
		System.out.println(search(arr, target));
	}
	private static boolean search(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high)/ 2;

			if (target == arr[mid]) {
				return true;
			} else if (target < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return false;

	}

}
