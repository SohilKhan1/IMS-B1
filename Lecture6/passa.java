package Lecture6;

public class passa {
	public static void main(String[] args) {

		String s = "abcdef";
		int m = 3;
		int[] a = { 1, 2, 3 };

		int n = s.length();
		int half = n / 2;

		int[] diff = new int[half + 1];

		for (int x : a) {
			int left = x - 1;

			if (left < half) {
				diff[left]++;
				diff[half]--;
			}
		}

		char[] arr = s.toCharArray();

		int active = 0;

		for (int i = 0; i < half; i++) {
			active += diff[i];

			if ((active & 1) == 1) {
				int j = n - 1 - i;

				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		System.out.println(new String(arr));
	}
}
