package webAPI;

import java.util.Arrays;

public class sample {

	
	public static void main (String[] args) {
		String[] testArr = {"1", "2"};
		String[] test2 = new String[2];
		test2[0] = "a";
		test2[1] = "b";
		
		System.out.println(Arrays.toString(reverseArray(testArr)));
		
		
	}
	
	private static String[] reverseArray(String[] arr) {
		String[] arr2 = new String[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr2[i] = arr[arr.length - 1 - i];
			
		}
		
		return arr2;
		
	}
	
	
	int findBigValue(int[] values) {
		int maxVal = Integer.MIN_VALUE;
		
		for (int i = 0; i < values.length; i++) {
			if (values[i] > maxVal) {
				maxVal = values[i];
			}
		}
		return maxVal;
	}
	

}
