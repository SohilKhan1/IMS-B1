package Lecture1;

import java.util.Arrays;

public class ProductOpt {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };

		int[] leftp = new int[arr.length];

		leftp[0] = 1;

		for (int i = 1; i < arr.length; i++) {
			int lastElementProduct = leftp[i - 1];
			int currentProoduct = lastElementProduct * arr[i - 1];
			leftp[i]=currentProoduct;
		}
		
		System.out.println(Arrays.toString(leftp));
		
		
		int[] rightp = new int[arr.length];
		
		rightp[rightp.length-1] = 1;

		for (int i = rightp.length-2; i >=0 ; i--) {
			int lastElementProduct = rightp[i + 1];
			int currentProoduct = lastElementProduct * arr[i + 1];
			rightp[i]=currentProoduct;
		}
		
		System.out.println(Arrays.toString(rightp));
		
		int[] result = new int[arr.length];
		
		for (int i = 0; i < result.length; i++) {
			result[i]=leftp[i]*rightp[i];
		}
		System.out.println(Arrays.toString(result));
//		return result;


		

	}

}
