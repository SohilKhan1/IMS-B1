package Lecture4;

public class kokoeatingbanana {
	public static void main(String[] args) {
		int[] arr = { 3, 6, 7, 11 };
		int h = 8;
		int speed = 1;
		while (true) {
			int totaltime = 0;
			for (int i = 0; i < arr.length; i++) {
				int time = arr[i] / speed;
				if (arr[i] % speed != 0) {
					time = time + 1;
				}
				totaltime += time;
			}
			System.out.println(totaltime);
			if (totaltime <= h) {
				System.out.println("answer = " + speed);
				break;
			}
			speed = speed + 1;
		}

	}

}
