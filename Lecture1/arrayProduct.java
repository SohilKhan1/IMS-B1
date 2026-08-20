package Lecture1;

public class arrayProduct {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };

		for (int i = 0; i < arr.length; i++) {

			int revprod = 1;
			for (int rev = i - 1; rev >= 0; rev--) {
				revprod *= arr[rev];
			}
//			System.out.println(revprod);

			int forwprod = 1;
			for (int forw = i + 1; forw < arr.length; forw++) {
				forwprod *= arr[forw];

			}
//			System.out.println(forwprod);

			System.out.println(revprod * forwprod);

		}

	}
}
