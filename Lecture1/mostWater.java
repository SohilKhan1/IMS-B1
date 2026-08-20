package Lecture1;

public class mostWater {
	public static void main(String[] args) {
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			int barA = arr[i];
			for (int j = 0; j < arr.length; j++) {
				int barB = arr[j];

				int h = Math.min(barA, barB);
				int w = j - i;
				int water = h * w;
				ans = Math.max(water, ans);
			}
		}
		System.out.println(ans);

	}

}
