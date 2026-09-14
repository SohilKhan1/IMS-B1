package Lecture5;

import java.util.Arrays;

public class rotateImage {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

//		int[][] arr = { { 1, 2, 3 },
//						{ 4, 5, 6 },
//						{ 7, 8, 9 } };
		rotate(arr);
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
		revRows(arr);
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
	}

	private static void revRows(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			int start = 0;
			int end = arr[0].length-1;
			while (start < end) {
				int temp = arr[i][start];
				arr[i][start] = arr[i][end];
				arr[i][end] = temp;
				start++;
				end--;
			}

		}

	}

	private static void rotate(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

	}

}
