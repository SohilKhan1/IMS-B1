package Lecture3;

public class subarrays {

	public static void main(String[] args) {
		int[] arr = { 10, -2, 30, 4 };
		printsubarrays(arr);
		findsum(arr);
		kadens(arr);

	}

	private static void kadens(int[] arr) {
		int ans = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		System.out.println(ans);

	}

	private static void findsum(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				System.out.println(sum);
				max = Math.max(max, sum);
			}
		}
		System.out.println("max= " + max);
	}

	private static void printsubarrays(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += arr[k];
					System.out.print(arr[k] + " ");
				}

				System.out.println(" sum = " + sum);
			}
		}

	}

}
