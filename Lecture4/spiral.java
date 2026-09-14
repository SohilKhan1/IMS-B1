package Lecture4;

public class spiral {
	public static void main(String[] args) {
		int[][] arr = new int[4][5];
		int a = 1;

		// insert data
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = a;
				a++;
			}
		}

		int totalelements = arr.length * arr[0].length;
		int count = 0;

		System.out.println("===========");
		int minr = 0;
		int minc = 0;
		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;

		while (count < totalelements) {
			for (int i = minc; i <= maxc && count < totalelements; i++) {
				System.out.print(arr[minr][i] + " ");
				count++;
			}
			minr++;

			for (int i = minr; i <= maxr && count < totalelements; i++) {
				System.out.print(arr[i][maxc] + " ");
				count++;
			}
			maxc--;

			for (int i = maxc; i >= minc && count < totalelements; i--) {
				System.out.print(arr[maxr][i] + " ");
				count++;
			}
			maxr--;

			for (int i = maxr; i >= minr && count < totalelements; i--) {
				System.out.print(arr[i][minc] + " ");
				count++;
			}
			minc++;
		}

	}

}
