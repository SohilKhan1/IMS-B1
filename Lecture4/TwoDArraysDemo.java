package Lecture4;

public class TwoDArraysDemo {
	public static void main(String[] args) {
		int[][] arr = new int[5][4];
		int a = 1;

		// insert data
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = a;
				a++;
			}
		}

		// print data
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		// rows
		System.out.println(arr.length);
		// cols
		System.out.println(arr[0].length);

	}

}
