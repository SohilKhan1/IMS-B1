package Lecture5;

public class printNumbers {
	public static void main(String[] args) {
		print(0);
	}

	private static void print(int i) {
		if (i > 5) {
			return;
		}
//		System.out.println(i);
		print(i + 1);
		System.out.println(i);
	}
}
